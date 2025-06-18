package streams;

import java.util.*;
import java.util.stream.Collectors;

public class GetDistinctCharactersFromAString {

    public static void main(String[] args){

        String input = "hello";

        Set<Character> distinctChar = input.chars()
                .mapToObj(c -> (char)c)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toSet());


        System.out.println(distinctChar);
    }
}
