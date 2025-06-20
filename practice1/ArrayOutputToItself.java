package practice1;

import java.util.Arrays;

public class ArrayOutputToItself {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4};

        int n = input.length;

        int[] output = new int[n];

        //calculate the products on left
        output[0] = 1;

        for(int i=1; i<n ;i++){

            output[i] = input[i-1] * output[i-1];
        }


        int right =1;
        for(int i=n-1; i>=0; i--){

            output[i] = output[i] * right;
            right = right * input[i];
        }

        System.out.println(Arrays.toString(output));
    }
}
