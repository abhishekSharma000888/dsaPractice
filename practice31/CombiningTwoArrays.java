package practice31;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombiningTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {7, -5, 3, 8, -4, 11, -19, 21};
        int[] arr2 = {6, 13, -7, 0, -4, 3, -5};

        List<Integer> l1 = Stream.concat(Arrays.stream(arr1).boxed()
                        , Arrays.stream(arr2).boxed())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int largest = l1.size()>1 ? l1.get(0) : l1.getLast();
        int secondLargest = l1.size()>2 ? l1.get(1) : l1.getLast();
        int smallest = l1.getLast();

        System.out.println("Largest: "+ largest);
        System.out.println("Second Largest: "+ secondLargest);
        System.out.println("Smallest: "+ smallest);

    }
}
