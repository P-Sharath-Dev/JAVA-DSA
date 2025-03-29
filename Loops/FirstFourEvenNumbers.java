package Loops;

import java.util.Scanner;

public class FirstFourEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                if (count < 4) {
                    System.out.println(i);
                    count++;
                }
                else{
                    break;      // we are using break so that the execution stops when 4 numbers are printed
                                //if we dont use break we get same o/p but execution will not stop untill condition in loop is false;
                }
            }
        }

        
        sc.close();
    }
}
