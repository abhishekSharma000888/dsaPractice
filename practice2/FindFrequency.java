package practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {

    public static void main(String[] args) {

        int[] input = {200, 404, 200, 500, 404, 200};


        Map<Integer,Long> l1 = Arrays.stream(input)
                .boxed()
                .collect(Collectors.groupingBy(
                        code -> code,
                        Collectors.counting()));


        System.out.println(l1);

    }
}
