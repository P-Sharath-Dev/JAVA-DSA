package Arrays1Part2;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 1, 2, 1, 2, 1};
        swapArray(arr);
    }

    public static void swapArray(int arr[]){
        for (int i = 0; i < arr.length-1; i=i+2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
