package Searching;

public class FindClosestIndex {
    public static int binarySearchClosest(int []nums, int left, int right, int target) {
        //Your code goes here
         int difference = Integer.MAX_VALUE;
         int differenceIndex = -1;
        while(left <= right){
            // finding mid
            int mid = (left + right)/2;
            int absValue = Math.abs(nums[mid] - target);
            if(absValue < difference){
                difference = absValue;
                differenceIndex = mid;
            } else if(nums[mid] < target){
                //update left
                left = mid + 1;
            } else{
                // update right
                right = mid - 1;
            }
        }
        return differenceIndex;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,7,9,11,12,45};
        int index = binarySearchClosest(arr, 0, arr.length-1, 6);
        System.out.println("closest index is : " + index);
    }
}
