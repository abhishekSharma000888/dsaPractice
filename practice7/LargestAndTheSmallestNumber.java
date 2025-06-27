package practice7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestAndTheSmallestNumber {
    public static void main(String[] args) {

        int[] arr = {45, 22, 89, 15, 62, 3, 77, 30};

        List<Integer> l1 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        int largest = l1.size()>0 ? l1.get(0) : l1.getLast();

        int smallest = l1.getLast();

        System.out.println("Largest:"+ largest);
        System.out.println("Smallest: "+ smallest);

    }
}
