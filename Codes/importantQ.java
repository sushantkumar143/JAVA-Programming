// HOW TO TAKE CHAR AS A INPUT ??

import java.util.Scanner;

class importantQ {
    public static int countChar(String str, char ch) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); 
        
        int count = countChar(str, ch);
        System.out.print("Count of "+ch+" in "+str+" = " + count);

        sc.close();
    }
}
