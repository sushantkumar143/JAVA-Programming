// Question - 03
// A retail store offers discounts on the total amount of items in a shopping cart based on specific conditions. You need to write a program that calculates the final amount a customer needs to pay after applying a discount. Use primitive data types, type conversion, and conditional statements to solve the problem.

// Conditions:
// If the total cart amount is greater than ₹5000, apply a 20% discount.
// If the total cart amount is between ₹3000 and ₹5000 (inclusive), apply a 10% discount.
// If the total cart amount is less than ₹3000, no discount is applied.
// The program should:

// Accept the total cart amount as input from the user (use primitive data types).
// Calculate the discount and the final amount to be paid.
// Use appropriate operators (e.g., arithmetic, relational, and ternary).
// Display the discount and final amount in a user-friendly format.

// Input: Enter the total cart amount: 4500
// output:
// Discount: ₹450.0
// Final Amount: ₹4050.0

// import java.util.Scanner;

// public class Question3{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.printf("Enter the total cart amount: ");
//         int amount = sc.nextInt();
//         double discount = 0.0;
//         double total = amount;

//         if(amount > 5000){
//             discount = amount - (amount*20)/100;
//             total -= discount;
//         }
//         else if(amount >= 3000 && amount <= 5000){
//             discount = amount - (amount*10)/100;
//             total -= discount;
//         }
//         System.out.printf("Discount: ₹%.1f\n", discount);
//         System.out.printf("Final Amount: ₹%.1f\n", total);
//     }
// }


import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total cart amount: ");
        int amount = sc.nextInt();
        double discount = 0.0;
        double total = amount;

        if (amount > 5000) {
            discount = (amount * 20) / 100;
        } else if (amount >= 3000 && amount <= 5000) {
            discount = (amount * 10) / 100; 
        }

        total -= discount; 

        System.out.printf("Discount: ₹%.1f\n", discount);
        System.out.printf("Final Amount: ₹%.1f\n", total);
        
        sc.close(); 
    }
}
