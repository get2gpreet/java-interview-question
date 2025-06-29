package org.lms.interview;

import java.util.*;

public class StringInterviewQuestion {

    private static void printPyramid(int noOfRows) {
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");
        //Implementing the logic
        for (int i = noOfRows; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(rowCount+" ");
            }
            System.out.println();
            //Incrementing the rowCount
            rowCount++;
        }
    }

    private static void removeWhiteSpaces(String input) {
        //String withoutWhiteSpaces = input.replaceAll("\\s+", "");
        String withoutWhiteSpaces = "";
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ' || charArray[i] == '\n') {
                withoutWhiteSpaces = withoutWhiteSpaces + charArray[i];
            }
        }
        System.out.println(withoutWhiteSpaces);
    }

    private static void checkIfStringIsPalindrome(List<String> list) {
        Map<String, Boolean> map = new HashMap<>();
        list.stream().forEach(str -> map.put(str,isPalindrome(str)));
        System.out.println("Checked : "+map);
    }

    private static Boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString().equals(str);
    }

    private static void duplicateCharCount(String inputString) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println( map);

    }

    private static void equalityOfTwoArrays(int[] arrayOne, int[] arrayTwo) {
        boolean equal = true;
        if (arrayOne.length != arrayTwo.length) {
            equal = false;
        }else  {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] == arrayTwo[i]) {
                    equal = true;
                }
            }
        }
        System.out.println(equal ? "Array is equal":" Array is not equal");
    }

    private static void equalityOfTwoArraysUsingCollection(String[] s1, String[] s2) {
        System.out.println(Arrays.equals(s1,s2) ? "Arrays are equal" : "Arrays are not equal");
    }

    public static void main(String[] args) {
        System.out.println("************************");

//        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
//        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
//        String[] s3 = {"java", "j2ee", "struts", "hibernate"};
//        equalityOfTwoArraysUsingCollection(s1,s2);
//        equalityOfTwoArraysUsingCollection(s1,s3);

//        int[] arrayOne = {2, 5, 1, 7, 4};
//        int[] arrayTwo = {2, 5, 1, 7, 4};
//        equalityOfTwoArrays(arrayOne,arrayTwo);

        //String input = "Butter";
        //duplicateCharCount(input);

        //pyramid of numbers
        //printPyramid(9);

        //String input = "Enter input string to be cleaned from white spaces...!";
        //RemoveWhiteSpaces
        //removeWhiteSpaces(input);

        //String str[] = {"hello", "world", "rotor", "1v1"};
        //List<String> list = Arrays.asList(str);
        //checkIfStringIsPalindrome(list);
        System.out.println("************************");
    }




}
