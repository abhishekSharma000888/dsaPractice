package practice17;

public class MatrixDiagonalProducts {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 0},
                {3, 4, 5},
                {6, 7, 8}
        };

        int product = 1;

        for(int i=0; i<matrix.length; i++){

            product*= matrix[i][i];
        }

        System.out.println("product is :" + product);
    }
}
