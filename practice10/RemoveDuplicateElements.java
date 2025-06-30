package practice10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        int[] arr = {2,2,3,4,2,6,8};

        List<Integer> h1 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(h1);
    }
}
