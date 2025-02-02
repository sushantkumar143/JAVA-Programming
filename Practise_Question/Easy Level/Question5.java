// Question - 05
// You are managing a system that uses a 4-bit permission scheme to represent the access rights of a user. Each bit represents a specific permission:

// Bit 3 (from left): Read
// Bit 2: Write
// Bit 1: Execute
// Bit 0 (from left): Delete
// Write a program that:

// Takes a 4-bit integer (0–15) as the current permissions.
// Takes a bit position (0 to 3) as input and toggles (reverses) the bit at that position using bitwise operators.
// Displays the new permission set after toggling the bit.

// Input:
// Enter current permissions (0-15): 10
// Enter the bit position to toggle (0-3): 2

// Output:
// Original permissions: 1010
// Updated permissions: 1110


import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current permissions (0-15): ");
        int currentPermissions = scanner.nextInt();

        System.out.print("Enter the bit position to toggle (0-3): ");
        int bitPosition = scanner.nextInt();

        String originalBinary = String.format("%4s", Integer.toBinaryString(currentPermissions)).replace(' ', '0');
        System.out.println("Original permissions: " + originalBinary);

        int updatedPermissions = currentPermissions ^ (1 << bitPosition);

        String updatedBinary = String.format("%4s", Integer.toBinaryString(updatedPermissions)).replace(' ', '0');
        System.out.println("Updated permissions: " + updatedBinary);

        scanner.close();
    }
}
