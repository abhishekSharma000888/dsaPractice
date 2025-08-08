package practice31;

public class MatrixDiagonals {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int leftSum = 0;

        for(int i=0; i<matrix.length; i++){

            leftSum += matrix[i][i];
        }

        int rightSum=0;
        System.out.println("Primary Diagonal: " + leftSum);

        for(int i=0; i<matrix.length; i++){

            rightSum += matrix[i][matrix.length-1-i];
        }
        System.out.println("Secondary diagonal: "+ rightSum);

    }
}
