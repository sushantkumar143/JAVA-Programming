// Create a class Employee with name, employeeId, and salary as private fields.
// Implement getter methods to display name, employeeId, and salary.
// Implement setter validation (salary cannot be negative).
// Provide a method increaseSalary(double amount).


import java.util.Scanner;

class Employee{
    private String name;
    private int empId;
    private float sal;

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee ID: ");
        empId = sc.nextInt();
        System.out.println("Enter Employee Salary: ");
        sal = sc.nextFloat();
        if(sal < 0){
            System.out.println("Enter the Valid Money. Money can't be Negative");
            System.out.println("Enter Employee Salary: ");
            sal = sc.nextFloat();
        }
    }

    public void getData(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + empId);
        System.out.println("Salary: " + sal);
    }

    public void increaseSalary(float n){
        sal += n;
    }
}

public class Encapsulation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();

        emp1.setData();
        emp1.getData();
        
        float money;
        money = sc.nextFloat();
        emp1.increaseSalary(money);

        emp1.getData();

    }
}