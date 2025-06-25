package practice4;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramExample {

    public static void main(String[] args) {

        String input = "Listen";

        String secondInput = "Silent";

        input = input.toLowerCase();

        secondInput = secondInput.toLowerCase();

        char[] a1 = input.toCharArray();
        char[] a2 = secondInput.toCharArray();


        Arrays.sort(a1);
        Arrays.sort(a2);

        if(a1.equals(a2)){

            System.out.println("The strings are anagrams!");
        } else {

            System.out.println("The strings are not anagrams!");
        }

    }
}
