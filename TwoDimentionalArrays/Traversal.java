package TwoDimentionalArrays;

import java.util.Scanner;

public class Traversal {

    //function to print 2d array
    public static void printArray(int arr[][]){ 
        int row = arr.length; // length of reference array(means no.of row's)
        int col = arr[0].length; // length of 1st array in 2d array.(means no.of col's)

        //printing array
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //function for taking input 
    public static int[][] takeUserInput(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no.of columns : ");
        int col = sc.nextInt();

        int arr[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.println("enter element at arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        return arr;
    }
    
    public static void main(String[] args) {
        //int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        int arr[][] = takeUserInput();

        //printing 2D Array
        printArray(arr);
    }
}
