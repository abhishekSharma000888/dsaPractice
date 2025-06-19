package dsaPatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindTheMissingElement {

    public static void main(String[] args){

        ArrayList<String> expected = new ArrayList<>();

        Collections.addAll(expected,"A", "B", "C", "D");

        HashSet<String> actual = new HashSet<>();
        Collections.addAll(actual,"A", "C", "D" );

        HashSet<String> missing = new HashSet<>();


        for(int i=0; i<expected.size(); i++){

            if(!actual.contains(expected.get(i))){

                missing.add(expected.get(i));
            }
        }

        System.out.println(missing);
    }
}
