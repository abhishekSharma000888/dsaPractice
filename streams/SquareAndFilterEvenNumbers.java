package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndFilterEvenNumbers {

    public static void main(String[] args){

        int[] input = {1,2,3,4,5,6};

        List<Integer> l1 = Arrays.stream(input)
                .boxed()
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .collect(Collectors.toList());

        System.out.println(l1);
    }
}
