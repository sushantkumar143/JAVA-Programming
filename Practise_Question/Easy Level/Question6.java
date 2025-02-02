// Question - 06
// Write a program that takes a sentence as input and finds the longest word in the sentence. If there are multiple words with the same maximum length, return the first one. Use String class methods and loops to solve the problem.

// Input: Coding is a fun challenge.
// Ouput: challenge

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().trim(); // Read input and remove leading/trailing spaces

        String longestWord = "";
        int maxLen = 0;

        String[] words = sentence.split("\\s+"); // Split by spaces (handling multiple spaces)

        for (String word : words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
                longestWord = word;
            }
        }

        System.out.println(longestWord);
        sc.close();
    }
}
