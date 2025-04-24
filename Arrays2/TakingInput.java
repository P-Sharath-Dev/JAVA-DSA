package Arrays2;

import java.util.Scanner;

public class TakingInput {
    public static int[] takeInputForArray(){
        System.out.println("Enter an integer for size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //taking size of array

        int arr[] = new int[size];
        
        //loop to take array elements from console;
        for(int i = 0; i < arr.length; i++){ 
            System.out.println("Enter value at index - " + i); 
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = takeInputForArray();
        for(int i : arr){ //printing arr[] array;
            System.out.print(i + " ");
        }
        System.out.println(arr); // prints reference of the array
    }
}
