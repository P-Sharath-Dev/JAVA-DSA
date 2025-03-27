package Loops;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfEven = 0;
        for (int i = 0; i <= n; i++) {
            if(i%2 == 0){               // instead of using if(){} instead start i from 2 and instead i++ use i+2
                sumOfEven = sumOfEven + i;
            }
        }
        System.out.println(sumOfEven);
        sc.close();
    }
}
