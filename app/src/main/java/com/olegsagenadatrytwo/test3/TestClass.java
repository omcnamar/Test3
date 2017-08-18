package com.olegsagenadatrytwo.test3;

import java.util.ArrayList;

/**
 * Created by omcna on 8/18/2017.
 */

/*
1. Sort the array with multiple same values in the array in an ascending order.
Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
2. Say you have a string of characters. Write an algorithm to collect and return a list of all
substrings such that order is maintained but characters may be skipped. So “frog” can produce fog, fg, rg, etc.
 */

public class TestClass {
    public static void main(String[] args) {
        int[] array =  {2,8,9,3,4,3,2,6,6,2,4,9,8};
        //sort
        System.out.println("Before sorting array is:");
        printArray(array);
        sort(array);
        System.out.println("After sorting array is:");
        printArray(array);
        //sub strings
        System.out.println("Sub strings of Frog: ");
        ArrayList<String> subStrings = getAllSubStrings("frog");
        System.out.println("Sub strings: " + subStrings.toString());
    }

    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static ArrayList<String> getAllSubStrings(String string){
        ArrayList<String> listOfSubStrings = new ArrayList<>();
        for( int i = 0 ; i < string.length() ; i++ )
        {
            for( int j = 1 ; j <= string.length() - i ; j++ )
            {
                String subString = string.substring(i, i+j);
                listOfSubStrings.add(subString);
            }
        }

        return listOfSubStrings;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }

        System.out.println();
    }
}
