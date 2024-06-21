package org.test;

public class Sumofarray {
    public static void main(String[] args) {
        // Define the array
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Initialize sum variable to store the sum of array elements
        int sum = 0;
        
        // Loop through each element in the array and add them to sum
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }
}
