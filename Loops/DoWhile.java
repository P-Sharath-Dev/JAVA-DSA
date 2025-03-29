package Loops;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(11); //generates random number between 0 - 10. 11 is excluded.
        System.out.println(randomNumber);
        int guess;
        do {
            System.out.println("guess a number between 1 - 10");
            guess = sc.nextInt();
            
        } while (guess != randomNumber);
        System.out.println("your guess is right!!!");

        sc.close();
    }
}
