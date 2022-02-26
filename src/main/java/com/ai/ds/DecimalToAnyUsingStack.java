package com.ai.ds;

import java.util.Stack;

import static java.lang.String.format;

/**
 * Stack Implementation
 *
 */
public class DecimalToAnyUsingStack {

    public static String convertToAny(int number,int radix){
        if (radix < 2 || radix > 16) {
            throw new ArithmeticException(format("Invalid input -> number: %d,radius: %d",number,radix));
        }
        Character[] tables = {
                '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'
        };
        Stack<Character> stackOfCharacter = new Stack<>();
        do {
            stackOfCharacter.push(tables[number % radix]);
            number = number / radix;
        } while (number != 0);
        StringBuilder stringBuilder= new StringBuilder();
        while (!stackOfCharacter.isEmpty()) {
            stringBuilder.append(stackOfCharacter.pop());
        }
        return stringBuilder.toString();
    }

    public static String convertToBinary(int number){
        Stack<Character> characterStack = new Stack<>();
        Character[] table = {'0','1'};
        do {
            characterStack.push(table[number%2]);
            number = number / 2;
        } while (number != 0);
        StringBuilder stringBuilder = new StringBuilder();
        while (!characterStack.isEmpty()) {
            stringBuilder.append(characterStack.pop());
        }
        return stringBuilder.toString();
    }
}