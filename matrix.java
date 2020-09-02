import java.util.Arrays;


public class matrix {
    
    public static void main(String[] args) {
        int [][] arr = makeMatrix();
        System.out.println(Arrays.deepToString(arr));
        // Calculate the number of rows and columns in the matrix
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("Rows: " + row);
        System.out.println("Columns " + col);
        sumRows(arr, row, col);
        sumCols(arr, row, col);
    }

    public static int[][] makeMatrix() {
        int [][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            // do the for in the row according to the column size
            for (int j = 0; j < arr[i].length; j++) {
                // multiple the random by 10 and then cast to in
                arr[i][j] = ((int) (Math.random() * 10) + 2);
            }
        }
        return arr;
    }

    
    public static void sumRows(int [][] arr, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("sum of ROW " + (i+1) +" = "+ sum);
            // reset the sum
            sum = 0;
        }

    }

    public static void sumCols(int [][] arr, int rows, int cols) {
        int sum = 0;
        for (int i = 0; i < cols; i++){
            for (int j = 0; j < rows; j++) {
                sum = sum + arr[j][i];
            }
            System.out.println("sum of Col " + (i+1) +" = "+ sum);
            // reset the sum
            sum = 0;
        }
    }


}
