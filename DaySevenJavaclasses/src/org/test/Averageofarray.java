package org.test;

public class Averageofarray {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Calculate sum of array elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        // Calculate average
        double average = (double) sum / arr.length;
        
        // Output the average
        System.out.println("Average = " + average);
    }
}
