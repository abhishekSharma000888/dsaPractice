package practice12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheFrequencyOfTheStatusCodes {

    public static void main(String[] args) {

        int[] input = {200, 404, 200, 500, 404, 200};
        int[] input2 =  {200, 404, 200, 500, 404, 200};


        Map<Integer, Long> l1 = Stream.concat(Arrays.stream(input).boxed(),
                           Arrays.stream(input2).boxed())
                          .collect(Collectors.groupingBy(code -> code,
                            Collectors.counting()));

        System.out.println(l1);



    }
}
