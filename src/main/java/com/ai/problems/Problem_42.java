package com.ai.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/**
 * Check if two strings are Anagrams
 */
public class Problem_42 {

    /**
     * Check if String is Anagram
     * @param stringActual Actual String
     * @param stringExpected Expected String
     * @return boolean true or false.
     */
    public static boolean checkIfStringIsAnagram(String stringActual,String stringExpected){
        if (stringActual.length() != stringExpected.length()) return false;
        else {
            char[] charsActual = stringActual.toCharArray();
            char[] charsExpected = stringExpected.toCharArray();
            Arrays.sort(charsActual);
            Arrays.sort(charsExpected);
            return Arrays.equals(charsActual, charsExpected);
        }
    }

    /**
     * Check if String is Anagram
     * @param stringActual Actual String
     * @param stringExpected Expected String
     * @return boolean true or false
     */
    public static boolean checkIfStringIsAnagram1(String stringActual,String stringExpected) {
        String stringActual_spaces = stringActual.toLowerCase().replaceAll(" ","");
        String stringExpected_spaces = stringExpected.toLowerCase().replaceAll(" ","");

        if (stringActual.length() != stringExpected.length()) return false;
        else {
            int[] m = new int[26];
            int[] n = new int[26];
            for (char a: stringActual_spaces.toCharArray()) {
                int i = a - 'a';
                m[i] = m[i] + 1;
            }
            for (char a: stringExpected_spaces.toCharArray()) {
                n[a - 'a']++;
            }
            for (int i = 0;i < 26;i++) {
                if (m[i] != n[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Check if String is Anagram
     * @param stringActual Actual String
     * @param stringExpected expected String
     * @return boolean true or false
     */
    public static boolean checkIfStringIsAnagram2(String stringActual,String stringExpected) {
        String stringActual_spaces = stringActual.toLowerCase().replaceAll(" ","");
        String stringExpected_spaces = stringExpected.toLowerCase().replaceAll(" ","");

        if (stringActual_spaces.length() != stringExpected_spaces.length()) return false;
        else {
            int[] a = new int[26];
            int[] b = new int[26];
            int k = stringActual_spaces.length();
            for (int i = 0; i < k; i++) {
                a[stringActual_spaces.charAt(i) - 'a']++;
                b[stringExpected_spaces.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (a[i] != b[i]) return false;
            }
        }
        return true;
    }

    /**
     * Check if String is Anagram
     * @param stringActual Actual String
     * @param stringExpected Expected String
     * @return boolean true or false
     */
    public static boolean checkIfStringIsAnagram3(String stringActual,String stringExpected) {
        if (stringActual.length() != stringExpected.length()) return false;
        else {
            HashMap<Character,Integer> nm = new HashMap<>();
            HashMap<Character,Integer> kk = new HashMap<>();
            for (char c : stringActual.toCharArray()) {
                nm.put(c, nm.getOrDefault(c,0)+1);
            }
            for (char c : stringExpected.toCharArray()) {
                kk.put(c, kk.getOrDefault(c,0)+1);
            }
            for (char c: nm.keySet()) {
                if (!nm.get(c).equals(kk.get(c))) return false;
            }
        }
        return true;
    }
}