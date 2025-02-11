// Question - 19
// Problem:

// Write a Java program that finds the second largest element in an array of integers. If the array contains fewer than two distinct elements, return a message indicating that the second largest element cannot be determined.

// Input:
// 5
// 3 5 1 5 2

// Output:
// Second Largest Element: 3

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(n<2){
            System.out.println("Second largest element cannot be determined");
            return;
        }

        int min = 0;
        for(int i=0; i<n; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        arr[min] = 99999999;
        for(int i=0; i<n; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }

        System.out.println("Second Largest Element: " + arr[min]);
    }
}