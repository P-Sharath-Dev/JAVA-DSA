package Patterns2;

import java.util.Scanner;

public class CharacterTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // A 
        // B C         // n = 4;
        // D E F
        // G H I J
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(temp > 25){ // when it reaches to Z starts again from A 
                    temp = 0;
                }
                System.out.print((char)('A'+temp)+" ");
                temp++;
                
            }
            System.out.println();
        }


        sc.close();
    }
}
