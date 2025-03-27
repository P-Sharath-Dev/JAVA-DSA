package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to print Hello World");
        int times = sc.nextInt();
        for (int i = 0; i <= times; i++) {
            System.out.println(i + ". Hello World");
        }

        // print sum of given number like n=5 means 1+2+3+4+5 => 15
        System.out.println("Enter a number to get sum");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
