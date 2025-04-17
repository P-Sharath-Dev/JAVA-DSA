package Arrays1;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // declaring array;
        int[] arr;
        // int arr1[];  //correct
        // int []arr2;  //correct

        arr = new int[5]; // initializing
        System.out.println(arr);

        boolean[] arr2 = new boolean[5];
        //   boolean[] arr2 = new int[5];   cannot convert int to boolean error

        System.out.println(arr2);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //     System.out.println(arr[5]);  java.lang.ArrayIndexOutOfBoundsException:

        //assign values to array
        arr[0] = 10;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 9;
        arr[4] = 5;
        
        //traversing array
        
            //for loop
        System.out.println("using for loop");
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }

        System.out.println();
        System.out.println("using while loop");
            //while loop;
        int i = 0;
        while (i <  arr.length) {
            System.err.print(arr[i] + " ");
            i++;
        }

            // for each
        System.out.println();
        System.out.println("using for-each");

        for (int value : arr) { // here value means the value in array not the index of array
            System.out.print(value + " ");
        }
        System.out.println();

        //        *****assing values at run-time*****
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr3[] = new int[size];
        for (int index = 0; index < arr3.length; index++) {

            System.out.println("\nEnter the value at index " + index + " : ");
    
            arr3[index] = sc.nextInt();
        }

        for (int j : arr3) {
            System.out.print(j + " ");
        }

        sc.close();
    }
}
