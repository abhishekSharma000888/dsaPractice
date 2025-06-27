package practice7;

import java.util.HashSet;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};

        HashSet<Integer> l1 = new HashSet<>();

        int difference =0;
        int missingElement =0;

        for(int i=0; i<arr.length-1; i++){

            difference = arr[i+1] - arr[i];
            l1.add(difference);
        }

        System.out.println(l1);

        for(int i=0; i<arr.length-1; i++){

            if((arr[i+1] - arr[i]) == 2){

               missingElement = arr[i] + 1;
            }
        }

        System.out.println("The missing element is: " + missingElement);
    }
}
