package hashSetPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DuplicateDetection
{
    public static void main(String[]args){

        ArrayList<Integer> l1=new ArrayList<>();

        Collections.addAll(l1,1,2,3,2,4,3);

        HashSet<Integer> h1=new HashSet<>();

        HashSet<Integer> h2=new HashSet<>();

        for(int num:l1){

        if(!h1.add(num)){
        h2.add(num);
        }
        }

        System.out.println("Duplicates! "+h2);

        }


}