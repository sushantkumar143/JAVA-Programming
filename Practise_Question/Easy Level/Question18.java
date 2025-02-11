// Question - 18
// Problem:

// Write a Java program to check if a given year is a leap year or not using an if-else construct. A year is a leap year if:
// It is divisible by 4.
// But not divisible by 100, unless it is also divisible by 400.

// Input: 2024
// Output: 2024 is a Leap Year.

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n%4 == 0){
            if(n%100 == 0 && n%400 != 0){
                System.out.println(n+" is not a Leap Year.");
            }
            else{
                System.out.println(n+" is a Leap Year.");
            }
        }
        else{
            System.out.println(n+" is not a Leap Year.");
        }
    }
}