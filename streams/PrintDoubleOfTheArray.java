package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintDoubleOfTheArray {

    public static void main(String[] args){

        int[] arr = {10, 4, 5, 7, 8, 9};

        List<Integer> doubled = Arrays.stream(arr)
                .boxed()
                .sorted()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        for (int num : doubled) {
            System.out.println(num);
        }
    }
}