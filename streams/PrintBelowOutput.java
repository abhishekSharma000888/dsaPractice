package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintBelowOutput {

    public static void main(String[] args){

        int[] l1 = {1234, 2132, 5455, 987, 6543};


        List<Integer> l2 = Arrays.stream(l1)
                           .boxed()
                           .collect(Collectors.toList());

        for(int num: l2){

            System.out.println("Selenium" + num);
        }

    }
}
