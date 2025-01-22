//Create a program that asks the user for their name, age, and favorite color, then displays a user profile with this information in java

import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        
        int age;
        System.out.print("Enter you age: ");
        age = sc.nextInt();

        String color;
        sc.nextLine();
        System.out.print("Enter your favourite color: ");
        color = sc.nextLine();

        System.out.println("\n ---- USER PROFILE ----\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}
