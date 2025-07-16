package practice19;

public class MatrixSum {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 1},
                {3, 4, 3},
                {4, 2, 0}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            sum += matrix[i][i];
        }

        System.out.println("The sum is: " + sum);
    }
}
