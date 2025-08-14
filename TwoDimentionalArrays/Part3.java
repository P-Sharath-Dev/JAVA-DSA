package TwoDimentionalArrays;

public class Part3 {
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9, 0,1,2}};

        System.out.println(arr); // prints address of 2d array.

        //ForEach in 2d array:
        for (int array[] : arr) {  //2d array -> array of arrays. use [] to access arrays inside 2d array
            System.out.println(array);//prints adderss of every array in 2d array

            for (int element : array) { // access elements from the array
                System.out.print(element + " ");
            }
            
            System.out.println();
        }

        // Jagged Array
        int jaggedArr[][] = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9}};

        //printing jaggedArr using forEach(it prints elements);
        System.out.println("Printing jagged array using foreach loop");
        for (int innerArr[] : jaggedArr) {
            for (int element : innerArr) {
                System.out.print(element);
            }
            System.out.println();
        }
        
        //printing jaggedArr using indexes
        System.out.println("Printing jagged array using indexes");

        for (int i = 0; i < jaggedArr.length; i++) { //for loop to print using indexes
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j]);
            }
            System.out.println();
        }

        // another way of jagged array

        System.out.println("creating cols length when it is not provided at the begining ");
        int jaggedArr2[][] = new int [3][];
        String str = "how is coding?";
        String strArr[] = str.split(" ");

        for (int i = 0; i < jaggedArr2.length; i++) {
            jaggedArr2[i] = new int[strArr[i].length()];
        }

        for (int i = 0; i < jaggedArr2.length; i++) {
            for (int j = 0; j < jaggedArr2[i].length; j++) {
                System.out.print(jaggedArr2[i][j]);
            }
            System.out.println();
        }
    }
}
