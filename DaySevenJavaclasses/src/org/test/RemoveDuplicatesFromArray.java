package org.test;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Input array with duplicates
        int[] arr = {10, 10, 20, 50, 60, 80, 60, 50};
        
        // Convert array to HashSet to remove duplicates
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        
        // Convert set back to array
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        
        // Print the array without duplicates
        System.out.print("Output a[]= {");
        for (int i = 0; i < uniqueArray.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(uniqueArray[i]);
        }
        System.out.println("}");
    }
}
