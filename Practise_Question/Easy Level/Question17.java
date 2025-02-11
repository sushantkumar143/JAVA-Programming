// Question - 17
// Problem:
// Write a Java program to perform matrix multiplication of two 2D arrays (matrices).
// Input two matrices of size n x m and m x p.
// Output the resultant matrix after multiplication.

// Input:
// Matrix A:
// 2 3
// 1 4

// Matrix B:
// 3 2
// 5 1

// Output:
// Resultant Matrix:
// 19 8
// 23 6

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix A (n): ");
        int n = sc.nextInt();
        System.out.print("Enter columns of Matrix A / rows of Matrix B (m): ");
        int m = sc.nextInt();
        System.out.print("Enter columns of Matrix B (p): ");
        int p = sc.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[m][p];
        int[][] result = new int[n][p];

        System.out.println("Enter elements of Matrix A (" + n + "x" + m + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B (" + m + "x" + p + "):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix (" + n + "x" + p + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
