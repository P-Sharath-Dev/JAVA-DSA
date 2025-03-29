package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //print 1 to N
        System.out.println("Enter a number to print 1 - N");
        int n = sc.nextInt();
        int i =1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }   

        //print N to 1
        System.out.println("Enter a number to print N to 1");
        int n1 = sc.nextInt();
        int j = n1;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        sc.close();
    }
}
