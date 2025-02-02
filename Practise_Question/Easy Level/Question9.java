// Write a Java program to find the row with the maximum sum in a 2D array.

// Input the number of rows and columns in the array.
// Take user input to populate the 2D array.
// Use a for-each loop to iterate over the array and calculate the sum of each row.
// Print the row number (1-based indexing) and the corresponding sum of the row with the maximum sum.

// Input:
// 3 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12

// Output:
// Row with the maximum sum: 3
// Maximum sum: 42


import java.util.Scanner;

public class Question9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        int index = 1;
        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=0; j<m; j++){
                temp += arr[i][j];
            }
            if(temp > sum){
                sum = temp;
                index = i+1;
            }
        }

        System.out.println("Row with the maximum sum: "+index);
        System.out.println("Maximum sum: "+sum);
    }
}