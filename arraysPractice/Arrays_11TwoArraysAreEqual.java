package arraysPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_11TwoArraysAreEqual {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        Collections.addAll(a, 1, 2, 3);

        ArrayList<Integer> b = new ArrayList<>();

        Collections.addAll(b, 3, 2, 1);

        Collections.sort(a);
        Collections.sort(b);

        boolean areArraysSorted = a.equals(b);

        System.out.println(areArraysSorted);

    }
}

