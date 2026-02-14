package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for(int i = 0; i < arr.length; i++){ // for pass
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){ // for checking
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
