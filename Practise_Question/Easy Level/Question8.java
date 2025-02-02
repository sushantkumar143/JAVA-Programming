// Question - 08
// Write a program that reverses the digits of a given integer. The program should handle negative integers correctly and return the reversed integer. If the reversed integer overflows the 32-bit signed integer range, return 0.

// Input: N = 123

// Output: 321

// Input 2: N = -456

// Output 2: -654


import java.util.Scanner;

public class Question8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original number: ");
        int n = sc.nextInt();
        int k = 0;

        while(n > 0){
            int temp = n%10;
            k *= 10;
            k += temp;
            n /= 10;
        }
        System.out.print("Reversed number: ");
        System.out.println(k);
    }
}