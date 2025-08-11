package practice34;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        int index = arr.length - 2;
        int secondLargest =  arr[index];

        System.out.println("The second largest is: "+ secondLargest);

    }
}
