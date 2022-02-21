package com.ai.problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	public static void main(String[] args) throws IOException {
		Logger LOGGER = LoggerFactory.getLogger(App.class);
		System.out.println("Hello World!");
		final String message = "Hello logging";
		LOGGER.trace(message);
		LOGGER.debug(message);
		LOGGER.info(message);
		LOGGER.warn(message);
		LOGGER.error(message);
	}

	//Create A String of Length N and which have k number of element
	public String solutions(int N,int K) {
		return "";
	}

		public String solution(int N, int K) {
			//A palindrom of k distinct and of lenght n

			Random r = new Random();
			ArrayList<Character> randomChar = new ArrayList<Character>(K);
			ArrayList<Character> randomCharWord = new ArrayList<Character>(N);
			for(int i = 0; i < K;i++){
				randomChar.add((char)(r.nextInt(26) +'a'));
			}

			for(int i = 0; i < N;i++) {
				randomCharWord.add(randomChar.get(r.nextInt(K)));
			}

			ArrayList<Character> randomCharWordTemp = randomCharWord;

			Collections.reverse(randomCharWordTemp);
			//System.out.println(randomCharWordTemp);
			if(Objects.equals(randomCharWordTemp,randomCharWord)){
				StringBuilder s = new StringBuilder();
				randomCharWord.stream().forEach(j -> s.append(j));
				return s.toString();
			} else {
				solution(N,K);
			}

			return "";
		}
}
