package Arrays2;

import java.util.Scanner;

public class ReverseArrayBetweenTwoIndices {
    public static void reverseArr(int arr[], int start, int end){
        int L = start;
        int R = end;
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
    }

    public static int takeInput(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();
        return value;
    }
    public static void main(String[] args) {
       
        //get size
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

        //get position to insert element
        int startIndex = takeInput("Enter the start element position : ");

        //get element to insert
        int endIndex = takeInput("Enter the end element position : ");

        reverseArr(arr, startIndex, endIndex);
        System.out.println("reversed array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
