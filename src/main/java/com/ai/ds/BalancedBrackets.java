package com.ai.ds;

import static java.util.Objects.equals;

import java.util.Objects;
import java.util.Stack;

import static java.lang.String.format;

public class BalancedBrackets {

    //1.

    /**
     * @param dataNeedsToBeChecked data that needs to be checked
     * @return Boolean True or false
     */
    public static boolean isBalanced(String dataNeedsToBeChecked) {
        if (dataNeedsToBeChecked == null || dataNeedsToBeChecked.equals("")) {
            throw new IllegalArgumentException(format("Data which needs to be checked : %s", dataNeedsToBeChecked));
        }
        Stack<Character> bracketStack = new Stack<>();
        for (Character charOfData : dataNeedsToBeChecked.toCharArray()) {
            switch (charOfData) {
                case '(':
                case '[':
                case '{':
                case '<':
                    bracketStack.push(charOfData);
                    break;

                case ')':
                case ']':
                case '}':
                case '>':
                    if (bracketStack.isEmpty() || !isPaired(charOfData, bracketStack.pop())) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return bracketStack.isEmpty();
    }

    //extra

    /**
     * Check if leftBracket and rightBracket are balanced
     * compare with array of paired brackets
     *
     * @param leftBracket  Character of left brackets
     * @param rightBracket Character of right brackets
     * @return Boolean true or false
     */
    public static Boolean isPaired(Character leftBracket, Character rightBracket) {
        Character[][] pairedBrackets = {
                {'(', ')'},
                {'[', ']'},
                {'{', '}'},
                {'<', '>'}
        };
        for (Character[] pairedBracket : pairedBrackets) {
            if (Objects.equals(pairedBracket[0],rightBracket) && Objects.equals(pairedBracket[1],leftBracket)) {
                return true;
            }
        }
        return false;
    }

}