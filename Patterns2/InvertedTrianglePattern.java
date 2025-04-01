package Patterns2;

import java.util.Scanner;

public class InvertedTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // * * * *
        // * * *
        // * *
        // *
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i+1; j++) {

                System.out.print("* ");

            }

            System.out.println();
        }

        System.out.println("another pattern");
        // * * * *
        // * * *
        // * *
        // *
        // int temp = n;
        // for (int i = 1; i <= n; i++) {
            
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print(temp + " ");
        //     }

        //     temp--;
        //     System.out.println();
        // }             ---OR---

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(n-i+1 + " ");
            }

            System.out.println();
        }


        sc.close();
    }
}
