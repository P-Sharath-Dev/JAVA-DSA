package Patterns1;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // - - - *
        // - - * * *
        // - * * * * *
        // * * * * * * *

        //row
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            //print Star
            for (int j = 1; j <= i+i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("Another pattern");

        // - - - 1
        // - - 1 2 3
        // - 1 2 3 4 5
        // 1 2 3 4 5 6 7

        //row
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            //print values
            for (int j = 1; j <= i+i-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

        System.out.println("Another pattern");

        // - - - 1
        // - - 2 2 2
        // - 3 3 3 3 3
        // 4 4 4 4 4 4 4

        //row
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            //print values
            for (int j = 1; j <= i+i-1; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

        }

        sc.close();
    }
}
