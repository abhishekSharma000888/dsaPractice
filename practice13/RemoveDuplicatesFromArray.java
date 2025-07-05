package practice13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 4, 2, 4, 6, 8, 9, 89, 98};

        List<Integer> l1 = Arrays.stream(arr1)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(l1);
    }
}
