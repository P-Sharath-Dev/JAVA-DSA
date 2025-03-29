package Loops;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++){ //here j is divided by i value and keeps increasing until if condition is true and j < i.
                if(i%j == 0){
                isPrime = false;
                break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
