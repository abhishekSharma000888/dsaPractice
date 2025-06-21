package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class JustTheOutputExample {

    public static void main(String[] args) {

        String s = "selenium";

        ArrayList<Integer> h1 = new ArrayList<>();

        Collections.addAll(h1, 1234,2132,5455,987,6543);

        for(int i=0; i< h1.size(); i++){

            System.out.println(s + h1.get(i));
        }
    }
}
