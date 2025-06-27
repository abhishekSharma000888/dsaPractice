package practice5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAnArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 9, 4, 2, 9, 7, 2, 1, 5, 8, 7, 6, 3, 3, 1};

        Set<Integer> h1 = Arrays.stream(arr).boxed()
                .distinct()
                .collect(Collectors.toSet());

        System.out.println(h1);
    }
}
