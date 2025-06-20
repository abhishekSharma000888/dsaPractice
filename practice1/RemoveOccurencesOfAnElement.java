package practice1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveOccurencesOfAnElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};


        List<Integer> l1 = Arrays.stream(arr)
                .boxed()
                .filter(n -> (n !=2))
                .collect(Collectors.toList());

        System.out.println(l1);
    }
}
