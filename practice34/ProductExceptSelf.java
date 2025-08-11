package practice34;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        System.out.println("The result array is: " + Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for (int i = 1; i < n; i++)
            ans[i] = ans[i - 1] * nums[i - 1]; // prefix product

        for (int i = n - 1, suffix = 1; i >= 0; i--) {
            ans[i] *= suffix;  // multiply with suffix product
            suffix *= nums[i];
        }
        return ans;
    }
}
