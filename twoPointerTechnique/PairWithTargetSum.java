package twoPointerTechnique;

import java.util.Arrays;

public class PairWithTargetSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        // First sort the array if not already sorted
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];  // Sum the values, not indices

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
                found = true;
                left++;  // Move both pointers to find other possible pairs
                right--;
            }
            else if (sum < target) {
                left++;  // Need a larger sum
            }
            else {
                right--;  // Need a smaller sum
            }
        }

        if (!found) {
            System.out.println("No pair found that sums to " + target);
        }
    }
}