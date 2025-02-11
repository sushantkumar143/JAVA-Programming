// Question - 15
// Problem Description:
// Write a program to print a diamond pattern of asterisks (*) with a given number of rows.

// Input: n = 5
// Output:
// *
// ***
// *****
// *******
// *********
// *******
// *****
// ***
// *

// Explanation:
// The pattern consists of two parts: the upper half and the lower half. The upper half has n rows, and the lower half has n-1 rows. Each row contains spaces followed by asterisks.

import java.util.Scanner;

public class Question15 {
    public static void printPattern(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i*2-1; j++) {
                System.out.print("*"); // Print leading spaces
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close(); 

        printPattern(n);
    }
}
