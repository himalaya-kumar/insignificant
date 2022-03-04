package com.ai.ds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Circular buffer is ds which init
 * in manor of fashion end is connected to first
 * giving a circular representation
 */
public class CircularBuffer {

    private static final Logger LOG = LoggerFactory.getLogger(CircularBuffer.class);

    private char[] bufferArray;
    public final int bufferSize;
    private int writeIndex = 0;
    private int readIndex = 0;

    private AtomicInteger readableData = new AtomicInteger(0);

    public CircularBuffer(int bufferSize) {
        if (!IsPowerfulOfTwo(bufferSize)) throw new IllegalArgumentException();
        this.bufferSize = bufferSize;
        bufferArray = new char[bufferSize];
    }

    private boolean IsPowerfulOfTwo(int i) {
        return (i & (i - 1)) == 0;
    }

    private int getTrueIndex(int i) {
        //will always give remainder less than buffer size
        return i % bufferSize;
    }

    public Character readOutChar() {
        Character result = null;
        if (readableData.get() > 0) {
            result = bufferArray[getTrueIndex(readIndex)];
            readableData.decrementAndGet();
            readIndex++;
        }
        return result;
    }

    public boolean writeToCharBuffer(char c) {
        boolean result = false;
        if (readableData.get() < bufferSize) {
            bufferArray[getTrueIndex(writeIndex)] = c;
            readableData.incrementAndGet();
            writeIndex++;
            result = true;
        }
        return result;
    }

    public static class TestWriter implements Runnable {

        String alphabet = "abcdefghijklmnopqrstuvwxyz123456789";
        Random random = new Random();
        CircularBuffer circularBuffer;

        public TestWriter(CircularBuffer circularBuffer) {
            this.circularBuffer = circularBuffer;
        }

        private char getRandomChar() {
            return alphabet.charAt(random.nextInt(alphabet.length()));
        }


        @Override
        public void run() {
            while (!Thread.interrupted()) {
                if (!circularBuffer.writeToCharBuffer(getRandomChar())) {
                    Thread.yield();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        }
    }

    public static class TestReadWorker implements Runnable {
        CircularBuffer buffer;

        public TestReadWorker(CircularBuffer circularBuffer) {
            this.buffer = circularBuffer;
        }

        @Override
        public void run() {
            LOG.info("Printing Buffer");
            while (!Thread.interrupted()) {
                Character character = buffer.readOutChar();
                if (character != null) {
                    LOG.info(String.valueOf(character.charValue()));
                } else {
                    Thread.yield();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException exception) {
                        LOG.info("");
                        return;
                    }
                }
            }
        }
    }
}