package practice10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLarges {

    public static void main(String[] args) {


        int[] arr = {2, 8, 9, 9, 1, 0};

        List<Integer> l1 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        int SecondLargest = l1.size() >= 1 ? l1.get(1) : l1.getLast();

        System.out.println(SecondLargest);
    }
}