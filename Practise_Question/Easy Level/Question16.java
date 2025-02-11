// Question - 16
// Write a Java program to print the Fibonacci series up to n terms using a for loop.
// The Fibonacci series starts with 0 and 1, and each subsequent number is the sum of the previous two.
// If n = 6, the series would be: 0, 1, 1, 2, 3, 5.

// Input: 6
// Output: Fibonacci Series: 0, 1, 1, 2, 3, 5

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i=0; i<n; i++){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a+b;
        }
    }
}