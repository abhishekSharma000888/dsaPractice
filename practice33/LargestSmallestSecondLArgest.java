package practice33;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestSmallestSecondLArgest {

    public static void main(String[] args) {

        int[] arr = {2, 8, 9, 9, 1, 0, 6, 7, 9, 0, 3, 5, 1, 11};

        List<Integer> l1 = Arrays.stream(arr).boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int largest = l1.size() > 1 ? l1.get(0) : l1.getLast();
        int secondLargest = l1.size() > 2 ? l1.get(1) : l1.getLast();
        int smallest = l1.getLast();

        System.out.println("The largest is " + largest);
        System.out.println("The second largest is " + secondLargest);
        System.out.println("The smallest is " + smallest);
    }
}