package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Circular Buffer Tests")
public class CircularBufferTests {

    @Test
    @DisplayName("TEST_1:Circular Buffer Tests")
    public void circularBufferTests() throws InterruptedException {
        int bufferSize = 1024;
        CircularBuffer circularBuffer = new CircularBuffer(bufferSize);
        Thread write_thread = new Thread(new CircularBuffer.TestWriter(circularBuffer));
        Thread read_thread = new Thread(new CircularBuffer.TestReadWorker(circularBuffer));
        read_thread.start();
        write_thread.start();

        Thread.sleep(10000);
        write_thread.interrupt();
        read_thread.interrupt();
    }
}
