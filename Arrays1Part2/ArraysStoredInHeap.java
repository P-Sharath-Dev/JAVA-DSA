package Arrays1Part2;

public class ArraysStoredInHeap {
    public static void main(String[] args) {
        int x = 10; 
        x++;
        int y = x;
        y++;
        System.out.println(x);
        System.out.println(y);

        //in arrays
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = arr1;  // arr1 and arr2 both are referring to same array so if anything is changed in one(arr1 or arr2) both will change
                            // b'coz both are pointing to same array. (means if you change arr1 then arr2 will also change)
        arr2[0] = 10;

        System.out.println("arr1 : " + arr1);
        System.out.println("arr2 : " + arr2);
        
        //printing arr1
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        //printing arr2
        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }
}
