package Arrays2;

import java.util.Scanner;

public class MoveZerosToEnd {
    public static void moveZeros(int n, int []a) {
        // Write your code here.
        int j = 0; // index for non-zeros 
       for(int i = 0; i < n; i++){  //loop for non-zeros
           if(a[i] != 0){
               a[j] = a[i];
               j++;
           }
       }
       for(; j < n; j++){ // loop for remaing  indices to set zeros
           a[j] = 0;
       }
    }
    public static int takeInput(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        
        return value;
    }
    public static void main(String[] args) {
        int size = takeInput("-- Enter size --");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
           arr[i] = takeInput("Enter int value at index " + i + " : ");
        }

        //print original array
        for (int i : arr) {
           System.out.print(i + " ");
        }
        System.out.println();

        moveZeros(size, arr);
        System.out.println("Zeros at end array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
