package hashSetPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindingUniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        Collections.addAll(l1, 1, 2, 3);

        ArrayList<Integer> l2 = new ArrayList<>();

        Collections.addAll(l1,2,3,4);

        HashSet<Integer> h1 = new HashSet<>();

        h1.addAll(l1);
        h1.addAll(l2);

        for(int num: h1){

            System.out.println(num);
        }


    }
}
