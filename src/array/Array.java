package array;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        // Declaration
//        <data_type>[] <array_name>;
//        <data_type> []<array_name>;
//        <data_type> <array_name>[];
        // Instantiation
//        <data_type> []<array_name> = new <data_type>[ <size> ];
        int a; // Declaration
        a = 10; // Instantiation
        int[] marks; // Declaration
        Integer[] markList2;
        marks = new int[10]; // Instantiation
        marks[0] = 10; // Initialisation
        int arr[] = new int[5]; // Both declaration and instantiation
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = -1;
        arr[3] = 90;
        arr[4] = 12;
//        arr[5] = 111; // Index out of Bound Error
//        arr[6] = 1321;
        System.out.println(a);
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int roll[] = {1,2,45,34,22,90,3,6,9};
        System.out.println("Printing all array elements by normal For loop ");
        for(int i = 0; i < roll.length; i++) {
            System.out.println(roll[i]);
        }
        // for each loop in java
        // for( <data_type> <variable_name> : <array_name> ) {
        //      System.out.println(<variable_name>);
        // }
        System.out.println("Printing all array elements by For Each Loop");
        for(int x: roll) {
            System.out.println(x);
        }

        // create a name list array
        // print all the names by the use of for each loop
        String nameList [] = {"soumya", "Aman", "amit"};
        for(String name : nameList) {
            System.out.println(name);
        }
        // WAP to find minimum mark and maximum mark from an markList.
        // WAP to find sum of all marks for each student
        // WAP to find the average mark in the class
        int []markList = {98,97,95,100,99,93,82,91,93};
        int minMark = markList[0]; // 98 => 97 => 95
        int maxMark = markList[0]; // 98
        int sumOfMarks = markList[0]; // 98 => 195 => 290
        for(int i = 1; i < markList.length; i++) {
            if(minMark > markList[i]) { // 98 > 97 (T), 97 > 95 (T)
                minMark = markList[i]; // min -> 97 ,=> 95
            }
            if(maxMark < markList[i]) { // 98 < 97 (F), 98 < 95 (F)
                maxMark = markList[i];
            }
            sumOfMarks = sumOfMarks + markList[i]; // 98 + 97 = 195 , 195 + 95 = 290
        }
        float averageMark = sumOfMarks / markList.length;
        System.out.println("Total Students : " + markList.length);
        System.out.println("Minimum Mark : " + minMark);
        System.out.println("Maximum Mark : " + maxMark);
        System.out.println("Sum of Marks : " + sumOfMarks);
        System.out.println("Average of Marks : " + averageMark);
    }
}
