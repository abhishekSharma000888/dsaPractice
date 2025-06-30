package practice10;

import java.awt.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFrequency {

    public static void main(String[] args) {

        int[] input1 = {200, 404, 200, 500, 404, 200};

        int[] input2 = {202, 202, 200, 500, 404, 404};

        Map<Integer,Long> h1 = Stream.concat(Arrays.stream(input1).boxed(),
                               Arrays.stream(input2).boxed())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(code -> code,
                        Collectors.counting()));

        System.out.println(h1);


    }
}
