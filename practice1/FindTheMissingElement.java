package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindTheMissingElement {

    public static void main(String[] args) {

        HashSet<String> expected = new HashSet<>();

        Collections.addAll(expected, "A", "B", "C", "D");

        HashSet<String> actual = new HashSet<>();

        Collections.addAll(actual, "A", "C", "D");

        HashSet<String> missing = new HashSet<>();

        for(String ch : expected){

            if(!actual.contains(ch)){

                missing.add(ch);
            }
        }

        System.out.println(missing);
    }
}
