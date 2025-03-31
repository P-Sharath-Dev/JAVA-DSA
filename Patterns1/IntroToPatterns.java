package Patterns1;

import java.util.Scanner;

public class IntroToPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Square pattern
        System.out.println("   *****in for loop*****   ");
        //rows
        for (int i = 1; i <= n; i++) {
            //columns
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") "); // for printing
            }
            System.out.println(); // for going on to next line
        }

        //same pattern in while loop
        System.out.println("   *****in while loop*****   ");
        int num1 = 1;
        while (num1 <= n) {
            int num2 = 1;
            while (num2 <= n) {
                System.out.print("(" + num1 + "," + num2 + ") ");
                num2++;
            }
            System.out.println();
            num1++;
        }
        sc.close();
    }
}
