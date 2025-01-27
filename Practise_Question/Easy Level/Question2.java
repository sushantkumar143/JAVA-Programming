// Question - 01

// Write a Java program to demonstrate the use of primitive data types and type conversion. The program should:

// Declare and initialize variables of different primitive data types (int, double, char, and boolean).
// Perform type conversion by converting an int to a double and a char to an int.
// Print the values of all variables before and after the conversions.

public class Question2 {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 50;
        double num2 = 80.5;
        char ch = 'a';
        boolean bool = true;

        // Display values before conversion
        System.out.println("----Before Conversion----");
        System.out.println("num1 = " + num1 + " (int)");
        System.out.println("num2 = " + num2 + " (double)");
        System.out.println("ch = '" + ch + "' (char)");
        System.out.println("bool = " + bool + " (boolean)\n");

        // Perform type conversion
        double convertedNum1 = (double) num1; // int to double
        int convertedCh = (int) ch;           // char to int

        // Display values after conversion
        System.out.println("----After Conversion----");
        System.out.println("num1 as double = " + convertedNum1 + " (double)");
        System.out.println("num2 = " + num2 + " (double)"); // remains the same
        System.out.println("ch as int = " + convertedCh + " (int)");
    }
}
