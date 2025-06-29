package practice9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutDuplicateIntegers {

    public static void main(String[] args) {

        int[] a = {1,2,2,3,3,34,6,7,8};

        List<Integer> h1 = Arrays.stream(a)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(h1);
    }
}
