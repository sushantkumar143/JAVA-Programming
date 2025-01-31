// Check Eligibility for Premium Membership

// Problem Statement:
// A company offers premium membership to customers based on the following criteria:

// The customer must be at least 18 years old.
// Their monthly income should be greater than or equal to ₹30,000.
// They should not have any pending dues.
// Write a program that uses relational, logical, and ternary operators to check if a customer is eligible for premium membership. Use appropriate keywords, identifiers, and access modifiers for the program.

// Requirements:
// Take the following inputs from the user:
// Age (integer)
// Monthly Income (double)
// Pending Dues (boolean: true if there are dues, otherwise false)
// Use a ternary operator to determine and display the customer's eligibility status.
// Ensure proper handling of variable declarations, data types, and access modifiers.

// Input:
// Enter your age: 25
// Enter your monthly income: 40000
// Do you have pending dues (true/false): false

// Output:
// You are eligible for premium membership.


import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your monthly income: ");
        double monthlyIncome = scanner.nextDouble();
        
        System.out.print("Do you have pending dues (true/false): ");
        boolean hasPendingDues = scanner.nextBoolean();
        
        String eligibility = (age >= 18 && monthlyIncome >= 30000 && !hasPendingDues) 
                            ? "You are eligible for premium membership." 
                            : "You are not eligible for premium membership.";
        
        System.out.println(eligibility);
        
        scanner.close();
    }
}
