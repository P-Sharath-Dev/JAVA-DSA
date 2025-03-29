package Loops;

import java.util.Scanner;

public class PrintReverseNumber {
    public static void main(String[] args) {
        int num = 01200300;
        System.out.println("num : - " + num);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Original n : - " + n);
        while (n % 10 == 0) { //removes trailing zeros at the end
            n = n / 10;
            System.out.println(n);
        }

        while (n>0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);  
            n = n/10;
        }

        sc.close();
    }
}
