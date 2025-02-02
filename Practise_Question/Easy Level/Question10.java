// Question - 10
// Create a Student class with the following attributes:
// name (String)
// rollNumber (int)
// marks (float)

// The class should include:

// 1. A constructor to initialize all the fields.
// 2. A method to display student details.
// 3. Overload a method called updateMarks to update marks in two ways:
// - By providing the new marks as a float value.
// - By providing the percentage increase in marks (as a float).

// Also, create a main method to:
// 1. Input details of a student.
// 2. Update marks using both methods.
// 3. Display the updated details.

// Example Input and Output:

// Enter student details:
// Name: John
// Roll Number: 101
// Marks: 85.5

// Update marks:
// New Marks: 90.5
// Updated Details: Name: John, Roll Number: 101, Marks: 90.5

// Update marks by percentage increase:
// Percentage: 10
// Updated Details: Name: John, Roll Number: 101, Marks: 99.55 in java


import java.util.Scanner;

class Student {
    // Attributes
    String name;
    int rollNumber;
    float marks;

    // Constructor to initialize fields
    public Student(String name, int rollNumber, float marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Updated Details: Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
    }

    // Method to update marks by providing new marks
    public void updateMarks(float newMarks) {
        this.marks = newMarks;
    }

    // Method to update marks by providing percentage increase
    public void updateMarksByPercentage(float percentage) {
        this.marks += this.marks * (percentage / 100);
    }
}

public class Question10 {
    public static void main(String[] args) {
        // Creating Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking student details as input
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Marks: ");
        float marks = scanner.nextFloat();

        // Creating Student object
        Student student = new Student(name, rollNumber, marks);

        // Display initial details
        student.displayDetails();

        // Update marks by providing new marks
        System.out.println("\nUpdate marks:");
        System.out.print("New Marks: ");
        float newMarks = scanner.nextFloat();
        student.updateMarks(newMarks);
        student.displayDetails();

        // Update marks by providing percentage increase
        System.out.println("\nUpdate marks by percentage increase:");
        System.out.print("Percentage: ");
        float percentage = scanner.nextFloat();
        student.updateMarksByPercentage(percentage);
        student.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
