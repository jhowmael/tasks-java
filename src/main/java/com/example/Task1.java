
/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
package com.example;

public class Task1 {
    private static String textString = "radar";

    public static boolean isPalindrome(String textString) {
        StringBuilder reversedString = new StringBuilder(textString);
        return textString.equals(reversedString.reverse().toString());
    }
    
    public static void main(String[] args) {
        if (isPalindrome(textString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
