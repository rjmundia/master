package com.javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class DuplicateStringOccurrence {
    
    public static void main(String[] args) {

        //User have to give input
        Scanner scanner = new Scanner(System.in);
        //Scan value store in str variable
        String str = scanner.nextLine();

        toFindDuplicateString(str);
        toFindDuplicateStringInsertedOrder(str);
        toFindDuplicateStringNaturalOrder(str);
    }

    /**
     * This method is used to find the Duplicate string count
     * and display each string count.
     * @param str - String
     */
    private static void toFindDuplicateString(String str) {
        String[] stringSplitArray = str.split(" ");
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (String s:stringSplitArray) {
            if (hashMap.containsKey(s)){
                hashMap.put(s,hashMap.get(s)+1);
            }else {
                hashMap.put(s,1);
            }
        }
        System.out.println("Hashmap: " + hashMap);
    }

    /**
     *  This method is used to find the Duplicate string count
     *  and display each string count in Inserted order
     * @param str - String
     */
    private static void toFindDuplicateStringInsertedOrder(String str) {
        String[] stringSplitArray = str.split(" ");
        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();

        for (String s:stringSplitArray) {
            if (hashMap.containsKey(s)){
                hashMap.put(s,hashMap.get(s)+1);
            }else {
                hashMap.put(s,1);
            }
        }
        System.out.println("LinkedHashmap: " + hashMap);
    }

    /**
     * This method is used to find the Duplicate string count
     * and display each string count in alphabetically order
     * @param str - String
     */
    private static void toFindDuplicateStringNaturalOrder(String str) {
        String[] stringSplitArray = str.split(" ");
       TreeMap<String,Integer> hashMap = new TreeMap<>();

        for (String s:stringSplitArray) {
            if (hashMap.containsKey(s)){
                hashMap.put(s,hashMap.get(s)+1);
            }else {
                hashMap.put(s,1);
            }
        }
        System.out.println("TreeMap: " + hashMap);
    }
}
