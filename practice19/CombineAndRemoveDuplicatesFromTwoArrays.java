package practice19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombineAndRemoveDuplicatesFromTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {7, -5, 3, 8, -4, 11, -19, 21};
        int[] arr2 = {6, 13, -7, 0, -4, 3, -5};

        List<Integer> l1 = Stream.concat(Arrays.stream(arr1).boxed(),
                        Arrays.stream(arr2).boxed())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(l1);
    }
}
