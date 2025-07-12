package practice16;

public class MatrixSum {
    public static void main(String[] args) {

        int[][] arr = {{4, 2, 1},
                {3, 5, 7},
                {8, 6, 9}

        };

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i];
        }
        System.out.println("sum is: " + sum);
    }
}
