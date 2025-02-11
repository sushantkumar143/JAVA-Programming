// Problem Description:
// Write a method to check if a given string is a palindrome (reads the same forwards and backwards).

// Input: str = ""madam""
// Output: true

// Input: str = ""hello""
// Output: false

// Explanation:
// For the input string ""madam"", it reads the same forwards and backwards, so the output is true. For ""hello"", it does not, so the output is false.

import java.util.Scanner;

public class Question13 {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        
        if (isPalindrome(str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
