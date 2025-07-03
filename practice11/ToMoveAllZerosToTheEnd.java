package practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ToMoveAllZerosToTheEnd {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        Collections.addAll(l1,1,0,2,0,3,4,0,5,6,0,7);

        ArrayList<Integer> l2 = new ArrayList<>();

        for(int i=0; i< l1.size(); i++){

            if(l1.get(i) ==0){

                l2.add(l1.get(i));
            }
        }
        for(int i=0; i< l1.size(); i++){

            if(l1.get(i) !=0){

                l2.add(l1.get(i));
            }
        }

        System.out.println(l2);
    }
}
