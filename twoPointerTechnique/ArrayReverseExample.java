package twoPointerTechnique;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReverseExample {

    public static void main(String[] args){

        int[] inputArr = new int[] {1, 2, 3, 4, 5};

        List<Integer> l1 = Arrays.stream(inputArr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        l1.toArray();


        for(int num: l1){

            System.out.println(num);

        }
    }
}
