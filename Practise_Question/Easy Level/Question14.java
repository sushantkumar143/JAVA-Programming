// Question - 14
// Problem Description:

// Write a program that prints the numbers from 1 to n. For multiples of three, print ""Fizz"" instead of the number, and for multiples of five, print ""Buzz"". For numbers which are multiples of both three and five, print ""FizzBuzz"".

// Input: n = 15
// Output:
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz

// Explanation:
// The program iterates through numbers from 1 to 15 and replaces multiples of 3 with ""Fizz"", multiples of 5 with ""Buzz"", and multiples of both with ""FizzBuzz""."

import java.util.Scanner;

public class Question14 {
    public static void function(int n){
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        function(n);
    }
}