package practice1;

import org.w3c.dom.css.Counter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountFrequencyOFStatusCodes {

    public static void main(String[] args) {
        int[] input = {200, 404, 200, 500, 404, 200};
        //Output: {200=3, 404=2, 500=1}

        Map<Integer, Long> l1 = Arrays.stream(input)
                .boxed()
                .collect(Collectors.groupingBy(code -> code,
                        Collectors.counting()));

        System.out.println(l1);


    }
}
