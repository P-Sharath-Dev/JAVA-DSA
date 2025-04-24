package Arrays2;

import java.util.Scanner;

public class ReverseArray {

    public static int[] reverseArray(int arr[]){
        //when you dont want to use another array. else take arr2 of same size and add elements of arr from last
                                    //means j = arr2.lenth, like that
        int lastIndex = arr.length-1; 
        for (int i = 0; i < arr.length/2; i++) {//loop runs lessThan arr.length/2 times and swapping i'th index and lastIndex and decreasing lastIndex value 
            // int lastIndex = arr.length-i;
            int temp = arr[i];
            arr[i] = arr[lastIndex];
            arr[lastIndex] = temp;
            lastIndex--;
            
        }
        System.out.println();
        return arr;
    }

    public static int takeInput(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        return value;
    }
    public static void main(String[] args) {
        int size = takeInput("Enter size of the array");

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = takeInput("Enter int value at index " + i + " : ");
        }
        
        //original array
        System.out.println("Original Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int reverseArray[] = reverseArray(arr);
        System.out.println("reversed array");
        for (int i : reverseArray) {
            System.out.print(i + " ");
        }
    }
}
