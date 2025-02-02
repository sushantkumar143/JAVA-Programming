// Question - 07
// Write a program to check if one string is a rotation of another string. A string
// S2 is a rotation of S1 if it can be obtained by moving some leading characters of
// S1 to its end, while keeping the order of characters intact.

// Input: S1 = ""coding""
// S2 = ""ingcod""

// Output: true


import java.util.Scanner;

public class Question7 {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty()) {
            return false;
        }
        
        String doubled = s1 + s1;
        
        // Check if S2 is a substring of the doubled string
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string (S1): ");
        String s1 = sc.nextLine();
        
        System.out.print("Enter second string (S2): ");
        String s2 = sc.nextLine();
        
        boolean result = isRotation(s1, s2);
        System.out.println("Output: " + result);
        
        sc.close();
    }
}
