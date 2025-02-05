import java.util.Scanner;

class functions1 {
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swap(a,b);
    }
}
