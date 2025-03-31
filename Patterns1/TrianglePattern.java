package Patterns1;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // *
        // * *
        // * * *
        // * * * *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("another pattern");
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("another pattern");
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        System.out.println("another pattern");
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }

        System.out.println("another pattern");
        // 1
        // 2 3
        // 3 4 5
        // 4 5 6 7
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i+j-1 + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
