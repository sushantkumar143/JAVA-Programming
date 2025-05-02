import java.util.Scanner;

class Student{
    String name;
    int roll;
    float marks;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class OOP1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = sc.nextLine();
        s1.roll = sc.nextInt();
        s1.marks = sc.nextFloat();

        s1.display();
    }
}