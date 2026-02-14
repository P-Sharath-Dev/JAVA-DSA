package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[], int length){
        for(int i = 0; i < length-1; i++){ // for pass
            for(int j = 0; j < length-1-i; j++){ // for checking
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        bubbleSort(arr, arr.length);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
