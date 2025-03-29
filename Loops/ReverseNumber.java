package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;

        for (int i = n; i > 0; i = i/10) {
            int lastDigit = i%10;
            reverse = reverse *10 + lastDigit;
        }
        System.out.println(reverse);
    }
}
