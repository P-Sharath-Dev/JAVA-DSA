package Arrays2;

import java.util.Scanner;

// java.util.Scanner;

public class FindAndUpdate {

    public static int takeInput(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        return value;
    }

    public static int findAndReplace(int arr[], int x, int y){
        //Linear Search
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                arr[i] = y;
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int size = takeInput("Enter size of the array");

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = takeInput("Enter int value at index " + i + " : ");
        }

        //print original array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //element to find
        int x = takeInput("Enter value to find");
        
        //element to replace
        int y = takeInput("Enter value to change");


        int ElementReplacedIndex = findAndReplace(arr, x, y);
        System.out.println("Element replaced at index : " + ElementReplacedIndex);
        
        //updated array
        System.out.println("updated array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
