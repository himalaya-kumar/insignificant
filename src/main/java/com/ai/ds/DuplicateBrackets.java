package com.ai.ds;

import java.util.Objects;
import java.util.Stack;

//((a + b) + (c + d)) = false
//(a + b) + ((c + d)) = true
public class DuplicateBrackets {

    public static boolean check(String string) {
        Stack<Character> stackOfCharacter = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            Character character = (Character) string.charAt(i);
            if (character == ')') {
                if (stackOfCharacter.peek() == '('){
                    return true;
                } else {
                    while (stackOfCharacter.size() > 0 && stackOfCharacter.peek() != '('){
                        stackOfCharacter.pop();
                    }
                    stackOfCharacter.pop();
                }
            } else {
                stackOfCharacter.push(character);
            }
        }
        return false;
    }
}