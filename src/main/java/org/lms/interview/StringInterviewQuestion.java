package org.lms.interview;

import java.util.*;

public class StringInterviewQuestion {

    public static void main(String[] args) {
        String str[] = {"hello", "world", "rotor", "1v1"};
        List<String> list = Arrays.asList(str);





        //checkIfStringIsPalindrome(list);
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
}
