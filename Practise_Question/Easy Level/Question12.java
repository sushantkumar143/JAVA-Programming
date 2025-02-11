// Question - 12
// Problem Description:

// Write a program to swap two integer variables without using a temporary variable.

// Input: a = 5, b = 10
// Output: a = 10, b = 5

// Explanation:
// The program swaps the values of a and b using arithmetic or bitwise operations, resulting in a being 10 and b being 5.


import java.util.Scanner;

public class Question12{
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swapping: ");
        System.out.println("a = " +  a);
        System.out.println("b = " +  b);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Before Swapping: ");
        System.out.println("a = " +  a);
        System.out.println("b = " +  b);

        swap(a,b);
    }
}