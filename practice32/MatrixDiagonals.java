package practice32;

public class MatrixDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //find left and right sum
        int leftSum=0;
        int rightSum=0;

        for(int i=0; i<matrix.length; i++){

            leftSum += matrix[i][i];
        }

        for(int i=0 ; i<matrix.length; i++){
            rightSum += matrix[i][matrix.length-1-i];
        }

        System.out.println("Left sum: "+ leftSum);
        System.out.println("Right sum: "+ rightSum);

    }
}
