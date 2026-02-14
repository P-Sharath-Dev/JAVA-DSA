package Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int l = 0, r = arr.length-1;
        while (l<=r) {
            // finding mid index
            int mid = (l+r)/2;

            //compare values with target
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                //update left
                l = mid + 1;
            }else { // means arr[mid] > target
                //update right
                r = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,6,8,11,19,26,32,35,44};
        int x = 2;
        int answerIndex = binarySearch(arr, x);
        if(answerIndex == -1){
            System.out.println("The element " + x + " doesn't exists.");
        }else{

            System.out.println("found element at index : " + answerIndex);
        }
    }
}
