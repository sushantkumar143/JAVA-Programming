import java.util.Scanner;

public class practise1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>0 && num2>0){
            System.out.println("Both the numbers are POSITIVE.");
        }
        else if(num1<0 && num2<0){
            System.out.println("Both the numbers are NEGATIVE.");
        }
        else{
            System.out.println("Either of the number is NEGATIVE.");
        }
    }
}