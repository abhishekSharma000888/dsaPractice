package practice11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArraysUsingStream {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        Collections.addAll(l1, 1, 0, 2, 0, 3, 4, 0, 5, 6, 0, 7);

        // Zeros
        List<Integer> zeros = l1.stream()
                .filter(n -> n == 0)
                .collect(Collectors.toList());

        System.out.println("Zeros: " + zeros);

        // Non-zeros
        List<Integer> nonZeros = l1.stream()
                .filter(n -> n != 0)
                .collect(Collectors.toList());

        System.out.println("Non-Zeros: " + nonZeros);

        // Combine the lists: zeros first, then non-zeros
        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(zeros);
        finalList.addAll(nonZeros);

        System.out.println("Final Output: " + finalList);
    }
}
