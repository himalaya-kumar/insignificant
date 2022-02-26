package com.ai.problems;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) throws IOException {
        Logger LOGGER = LoggerFactory.getLogger(App.class);
        System.out.println("Hello World!");
        final String message = "Hello {} logging";
//        LOGGER.trace(message);
//        LOGGER.debug(message);
        LOGGER.info(message,"welcome");
//        LOGGER.warn(message);
//        LOGGER.error(message);
		System.out.println(solution(15,8));
    }


    //Create A String of Length N and which have k number of element
    public static String solution(int N, int K) {
		List<Character> characters = simplePalindromePattern(N,K);
		StringBuilder stringBuilder = new StringBuilder();
		characters.forEach(stringBuilder::append);
		return stringBuilder.toString();
    }


    public static List<Character> simplePalindromePattern(int N, int K) {
		if (N < K) throw new IllegalArgumentException("");
		List<Character> randomCharWord= generateRandomCharacter(N,K);
		LinkedList<Character> palindromeList = new LinkedList<Character>();
		Random random = new Random();
		if (N % 2 == 0) {
			int randomN = random.nextInt(K - 1);
			for (int i = 0; i < N/2;i++) {
				palindromeList.addFirst(randomCharWord.get(randomN));
				palindromeList.addLast(randomCharWord.get(randomN));
				randomN = random.nextInt(K - 1);
			}
		} if (N % 2 != 0) {
			int randomN = random.nextInt(K - 1);
			for (int i = 0; i < N/2;i++) {
				palindromeList.addFirst(randomCharWord.get(randomN));
				palindromeList.addLast(randomCharWord.get(randomN));
				randomN = random.nextInt(K - 1);
			}
			palindromeList.add(N/2 - 1,randomCharWord.get(randomN));
			//0 1 2 3 4 5 6
		}
		return palindromeList;
    }


	public static ArrayList<Character> generateRandomCharacter(int N,int K) {
        Random random = new Random();
        ArrayList<Character> randCharacters = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            randCharacters.add((char) (random.nextInt(26) + 'a'));
        }
        return randCharacters;
    }
}
