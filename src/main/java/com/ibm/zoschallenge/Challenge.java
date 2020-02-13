package com.ibm.zoschallenge;

import java.math.BigInteger;

public class Challenge {

    /**
     * Upper case the input string and return it.
     *
     */
    public static String testOne(String input) {
        return input.toUpperCase();
    }

    /**
     * Return the largest value out of the inputs.
     *
     */
    public static int testTwo(int a, int b) {
        return Integer.max(a, b);
    }

    /**
     * Return the smallest value out of the inputs.
     */
    public static int testThree(int a, int b){
        return Integer.min(a, b);
    }

    /**
     * Return the square root of the input.
     */
    public static int testFour(double a){
        return (int) Math.sqrt(a);
    }

    /**
     * Compare the input of two strings and
     * return if they match or not.
     * Note: Case does matter!
     */
    public static boolean testFive(String input1, String input2){
        return input1.equals(input2);
    }

    /**
     * Combine two strings together.
     */
    public static String testSix(String input1, String input2){
        return input1.concat(input2);
    }

    /**
     * Find the absolute value of the input.
     */
    public static int testSeven(int a){
        return Math.abs(a);
    }

    /**
     * Find the quotient of the inputs.
     */
    public static int testEight(int a, int b){
        return a/b;
    }

    /**
     * Find the product of the inputs.
     */
    public static int testNine(int a, int b){
        return a*b;
    }

    /**
     * Return the input without any white spaces at the beginning or end.
     */
    public static String testTen(String input1){
        return input1.trim();
    }

    /**
     * Find the sine value of the input.
     */
    public static int testEleven(double a){
        return (int) Math.sin(Math.toRadians(a));
    }

    /**
     * Replace a given letter in a string with another given letter.
     */
    public static String testTwelve(String input1, char a, char b){
        return input1.replace(a,b);
    }

    /**
     * Determine if the given string starts with the specified string.
     */
    public static boolean testThirteen(String givenString, String specifiedString){
        return givenString.startsWith(specifiedString);
    }

    /**
     * Return a string of all lower case letters.
     */
    public static String testFourteen(String input1){
        return input1.toLowerCase();
    }

    /**
     * Find the difference between the given inputs
     */
    public static int testFifteen(int a, int b){
        return a-b;
    }

}
