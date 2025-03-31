package Patterns1;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("printing row value");
        // 1 1 1 1
        // 2 2 2 2
        // 3 3 3 3
        // 4 4 4 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("printing col value");
        // 1 2 3 4
        // 1 2 3 4
        // 1 2 3 4
        // 1 2 3 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        System.out.println("printing col value in revese");
        // 4 3 2 1
        // 4 3 2 1
        // 4 3 2 1
        // 4 3 2 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(n+1-j + " "); // prints value as 4 3 2 1. (or) start j from n and print then j--
            }
            System.out.println();
        }

        System.out.println("another pattern");
        // 1 * 2 *
        // 1 * 2 *
        // 1 * 2 *
        // 1 * 2 *
        
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= n; j++) {
                
                if(j%2 == 0){
                    System.out.print("* ");
                }
                else{
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
