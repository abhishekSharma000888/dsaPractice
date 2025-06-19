package twoPointerTechnique;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4};


        List<Integer> l1 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        l1.toArray();

        for(int num: l1){

            System.out.println(num);
        }


    }
}
