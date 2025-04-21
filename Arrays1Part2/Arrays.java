package Arrays1Part2;

public class Arrays {
    public static void main(String[] args) {
        //finding maximum in array
        int arr[] = {10, 5, 222, 11, 4, 22, 99, 220, 221};
        int maxinum = findMaxNumInArray(arr);
        int secondMax = secondMaximumNumber(arr);
        System.out.println("maximun number in the array is " + maxinum);
        System.out.println("second maximun number in the array is " + secondMax);
        int max2 = secondlogicForSecondMax(arr);
        System.out.println("second max with secondMaximumNumber() : " + max2);
    }

    //finding maximum number
    public static int findMaxNumInArray(int arr[]){
        int max = Integer.MIN_VALUE; // int max can also be assigned with arr[0]
        for (int i : arr) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    // finding second maximum number
    public static int secondMaximumNumber(int arr[]){
        int secondMax = Integer.MIN_VALUE; //int secondMax can also be assigned with arr[0]
        int max = findMaxNumInArray(arr);
        for (int i : arr) {
            if((i < max) && (i > secondMax)){
                secondMax = i;
            }
        }
        return secondMax;
    }

    //another logic for finding second max
    public static int secondlogicForSecondMax(int arr[]){
        int max = arr[0];
        int secondMax = max;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
