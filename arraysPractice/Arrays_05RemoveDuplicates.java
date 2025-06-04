package arraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays_05RemoveDuplicates {

    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(2);

        HashSet<Integer> seen = new HashSet<>(a);

        ArrayList<Integer> b = new ArrayList<>(seen);

        System.out.println(b.size());

        System.out.println("After reversal the elements are: ");

        for( int num: b){

            System.out.println(num);
        }
    }

}
