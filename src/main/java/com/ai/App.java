package com.ai;

import java.io.File;
import java.io.IOException;

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
}
