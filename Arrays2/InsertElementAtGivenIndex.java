package Arrays2;

import java.util.Scanner;

public class InsertElementAtGivenIndex {

    public static int insertElementAtGivenPosition(int arr[], int position, int element, int size){
        for (int i = size; i > position; i--) {
            arr[i] = arr[i-1];
        }
        arr[position] = element;
        return size+1;
    }

    public static int takeInput(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        return value;
    }
    public static void main(String[] args) {
        //get capacity
        int capacity = takeInput("-- Enter capacity --");
        //craete array with capacity;
        int arr[] = new int[capacity];
        //get size
        int size = takeInput("-- Enter size --");

        for (int i = 0; i < size; i++) {
            arr[i] = takeInput("Enter int value at index " + i + " : ");
        }

        //print original array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //get position to insert element
        int position = takeInput("Enter the position to insert element : ");

        //get element to insert
        int element = takeInput("Enter the element to insert : ");

        int updatedSize = insertElementAtGivenPosition(arr, position, element, size);
        System.out.println("updatedSize : " + updatedSize);

        //print modified array
        System.out.println("Modified array");
        for (int i = 0; i < updatedSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
