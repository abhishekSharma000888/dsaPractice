package practice22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramToFilterSpecificElement {
    public static void main(String[] args) {

        int[] arr1 = {2, 2, 3, 4, 2, 6, 8};

        List<Integer> l1 = Arrays.stream(arr1)
                .boxed()
                .filter(n -> n != 2)
                .collect(Collectors.toList());

        System.out.println(l1);
    }
}
