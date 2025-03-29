package Loops;

import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(0 +" "+ 1);
        int a = 0;
        int b = 1;
        // two programs in one program. one to print till N only. one to print N times 
        for(int i=0; i<n-2; i++){ // here i use n-2 bcoz 0 and printing directly when code executes. used this to print this series N numbers(ex n=8 means prints 8 numbers in series)
            int c = a+b;
            // if(c > n){  //this is used to print series till n only (ex n = 50 means it will print till 34 only the next value is greater than 5 so it stops)
            //     break;
            // }
            System.out.print(" " + c);
            a = b;
            b = c;
            
            
        }
    }
}
