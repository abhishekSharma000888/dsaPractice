package practice29;

public class KadaneMaxSubArray {

    /*
    First we have an input array. We need to initialize currentSum and maxSum to the current element of the array.
    In our case it is first element.
    Second, we need to iterate from the second element and check whether the current sum is lesser than the element, if it
    is less, assign the value of the current element to the current sum and begin the array index.
    else add the current element to the current sum.

    Thirdly, compare currentSum with MaxSum, if the later is smaller, assign it to the value of currentSum, update the end
    index to the value of i.
     */
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];

        int start = 0;
        int end = 0;
        int startIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                startIndex = i;
            } else {
                currentSum += arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = startIndex;
                end = i;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.print("Subarray with maximum sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}