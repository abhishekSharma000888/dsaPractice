package practice34;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];
        int start = 0;
        int end = 0;
        int startIndex=0;

        for(int i=1; i<arr.length; i++){
            if(arr[i]> currentSum + arr[i]){
                currentSum = arr[i];
                startIndex = i;
            } else {
                currentSum += arr[i];
            }

            if(currentSum>maxSum){
                maxSum = currentSum;
                start = startIndex;
                end = i;
            }
        }

        System.out.println("The maximum sum is: "+ maxSum);

        for(int i=start; i<=end; i++){
            System.out.println(arr[i]);
        }
    }
}
