package TwoDimentionalArrays;

public class SpiralPrint {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {14, 15, 16, 5}, {13, 20, 17, 6}, {12, 19, 18, 7}, {11, 10, 9, 8}};

        int row = matrix.length;

		if(row == 0){ // checking if array has 0 rows(means empty)
			return;
		}
        
		int col = matrix[0].length;
		int top = 0, left = 0;
		int right = col-1, bottom = row-1;

		while(left <= right && top <= bottom){
			//left to right
			for(int i = left; i <= right; i++){
				System.out.print(matrix[top][i] + " ");
			}
			top++;

			//top to bottom
			for(int i = top; i <= bottom; i++){
				System.out.print(matrix[i][right] + " ");
			}
			right--;

			//right to left
			if(top <= bottom){
				for(int i = right; i >= left; i--){
					System.out.print(matrix[bottom][i] + " ");
				}
			}
			bottom--;

			//bottom to right
			if(left <= right){
				for(int i = bottom; i >= top; i--){
					System.out.print(matrix[i][left] + " ");
				}
			}
			left++;

		}
    }
}
