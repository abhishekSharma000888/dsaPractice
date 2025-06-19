package streams;

import java.util.*;
import java.util.stream.Collectors;

public class FilterPalindromesExample {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("madam", "apple", "noon", "code");

        List<String> l1 = input.stream()
                .filter(FilterPalindromesExample::isPalindrome)
                .collect(Collectors.toList());

        System.out.println(l1);
    }

    private static boolean isPalindrome(String str) {

        String cleanstr = str.toLowerCase();

        return cleanstr.equals(new StringBuilder(cleanstr).reverse().toString());


    }
    }

