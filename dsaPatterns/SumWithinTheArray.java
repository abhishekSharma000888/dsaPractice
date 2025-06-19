package dsaPatterns;

public class SumWithinTheArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 10;

        int left = 0;
        int right = arr.length -1;
        boolean found = false;

        // First sort the array if not already sorted
        java.util.Arrays.sort(arr);

        while (left < right) {
            int sum = arr[left] + arr[right];  // Use array values, not indices

            if (sum == target) {
                System.out.println("The pair is: " + arr[left] + " and " + arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;  // Need larger sum, move left pointer right
            } else {
                right--;  // Need smaller sum, move right pointer left
            }
        }

        if (!found) {
            System.out.println("No pair found that sums to " + target);
        }
    }
}
