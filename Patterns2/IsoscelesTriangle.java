package Patterns2;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //         1 
        //       1 2 1     // n = 1
        //     1 2 3 2 1 
        //   1 2 3 4 3 2 1 
        for (int i = 1; i <= n; i++) { // rows
            for(int j = 1; j <= n-i; j++){ //spaces
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){  //increasing numbers
                System.out.print(j+" "); 
            }
            for(int j = 1; j <= i-1; j++){ // decreasing numbers 
                System.out.print(i-j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
