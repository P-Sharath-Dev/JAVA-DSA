package Patterns2;

import java.util.Scanner;

public class CharacterSquarePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // A B C D E
        // A B C D E    // n = 5;
        // A B C D E
        // A B C D E
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)('A' + j -1) + " ");
            }
            System.out.println();
        }

        System.out.println("another pattern");
        // A A A A
        // B B B B
        // C C C C
        // D D D D
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)('A' + i -1) + " ");
            }
            System.out.println();
        }

        System.out.println("another pattern");
        // A B C D E
        // B C D E F  // n = 5;
        // C D E F G
        // D E G H I
        for (int i = 1; i <= n; i++) {
            int temp = i;
            for (int j = 1; j <= n; j++) {
                System.out.print((char)('A' + temp -1) + " ");
                temp++;
            }
            System.out.println();
        }

        sc.close();

    }
}
