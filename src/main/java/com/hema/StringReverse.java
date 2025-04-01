package com.hema;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String x="ABC Tech";
        char y[]=x.toCharArray();
        int size=y.length;
        char a[]=new char[size];
        char b[]=new char[size];
       int i=0;
       while(i!=size){
           a[i]=y[i];
          // System.out.print(a[i]);
           a[size-1-i]=y[i];
           ++i;
        }
       System.out.println(y);
       System.out.println(a);
       System.out.println(b);
    }
}



//package com.hema;
//
//import java.util.Arrays; // Import Arrays class
//
//public class StringReverse {
//    public static void main(String[] args) {
//        String str = "ABC Tech";
//        char[] originalArray = str.toCharArray();
//        int size = originalArray.length;
//        char[] reversedArray = new char[size];
//
//        // Reverse the string
//        for (int i = 0; i < size; i++) {
//            reversedArray[size - 1 - i] = originalArray[i];
//        }
//
//        // Print original and reversed arrays
//        System.out.println("Original String: " + str);
//        System.out.println("Original Array: " + Arrays.toString(originalArray));
//        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
//        System.out.println("Reversed String: " + new String(reversedArray));
//    }
//}
//
