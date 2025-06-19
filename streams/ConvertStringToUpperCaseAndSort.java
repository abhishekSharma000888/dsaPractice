package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCaseAndSort {

    public static void main(String[] args){

        String[] input = {"sun", "moon", "star", "sky"};



        List<String> l1 = Arrays.stream(input)
                .map( String:: toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(l1);


    }
}
