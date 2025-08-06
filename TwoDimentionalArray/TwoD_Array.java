package TwoDimentionalArray;

public class TwoD_Array {
    public static void main(String[] args) {
        
        //1D Array
        int[] arr_1d = new int [5];
        int arr1_1d[] = {1,2,3,4,5};

        //2D Arrays
        // int[][] arr = new int [3][4];
        // int arr[][] = new int [3][4];
        // int [][] arr = new int [3][4];   // all are correct syntax
        // int []arr[] = new int [3][4];

        int[][] arr = {{1,2,3,4}, {4,5,6,7}, {7,8,9,10}}; // Array of arrays
        System.out.println(arr); // address of 2D Array
        System.out.println(arr[0]); // address of 1st array in 2D Array
        System.out.println(arr[1]); // address of 2nd array in 2D Array
        System.out.println(arr[2]); // address of 3rd array in 2D Array   
        System.out.println(arr[0][0]); // value at 0,0 in 2d array
        System.out.println(arr[1][0]); // value at 1,0 in 2d array

    }
}
