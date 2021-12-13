package com.ai;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UtilityClassTests {
		
	@Test
	@DisplayName("+ve:readFileAndGiveDataBackInString")
	public void readFileAndGiveDataBackInStringTest() throws IOException {
		UtilityClass.get().readFileAndGiveDataBackInString(new File("D:\\Projects\\Learn\\Java\\app-10\\AIProject\\src\\test\\resources\\utility\\Testcode_file.txt"));
	}

}