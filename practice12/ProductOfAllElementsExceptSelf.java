package practice12;

import java.util.Arrays;

public class ProductOfAllElementsExceptSelf {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};

        int n = input.length;

        int[] output = new int[n];

        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * input[i - 1];
        }

        // Step 2: Calculate suffix product on the fly and update output array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * rightProduct;
            rightProduct *= input[i];
        }

        System.out.println("Output: " + Arrays.toString(output));
    }
}
