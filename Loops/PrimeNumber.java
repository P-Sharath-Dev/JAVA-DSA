package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if (count >= 1) {
            System.out.println("It is not a Prime Number");
        }
        else{
            System.out.println("It is a Prime Number");
        }
        sc.close();
    }
}
