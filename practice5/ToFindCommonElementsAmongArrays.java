package practice5;

import java.util.Arrays;
import java.util.HashSet;

public class ToFindCommonElementsAmongArrays {

    public static void main(String[] args) {


    int[] arr1 = {1, 3, 4, 5, 7, 9};
    int[] arr2 = {2, 3, 5, 6, 9};

    HashSet<Integer> h1 = new HashSet<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

    for(int i=0; i< arr1.length; i++){

        for(int j=0; j<arr2.length; j++){

            if(arr1[i] == arr2[j]){

                h1.add(arr1[i]);
            }
        }

    }

    System.out.println("The common elements are: "+h1);


    }
}
