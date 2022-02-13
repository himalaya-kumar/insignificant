package com.ai.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilityClass {

	Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	private UtilityClass() {
		
	}

	/**
	 * It reads data from File and give data in form of String 
	 * @param {@code File}
	 * @return {@code String}
	 * @throws IOException
	 */
	public String readFileAndGiveDataBackInString(File file) throws IOException {
		LOGGER.info("UtilityClass#readFileAndGiveDataBackInString(File)");
		var fileTemp = file;
		var fileReader = new FileReader(fileTemp);
		var st = Optional.of(new String());

		try (var bufferedReader = new BufferedReader(fileReader)) {
			while ((st = Optional.of(bufferedReader.readLine())) != null) {
				return st.orElse("EMPTY_STRING");
			}
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("EMPTY_STRING FROM CATCH");
		}
		return "EMPTY_STRING";
	}

	@SafeVarargs
	public static <T> LinkedList<T> linkedList(T... elements) {
		return Stream.of(elements).collect(Collectors.toCollection(LinkedList::new));
	}

	public static UtilityClass get() {
		return new UtilityClass();
	}
}
