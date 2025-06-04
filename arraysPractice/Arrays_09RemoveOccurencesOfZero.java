package arraysPractice;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays_09RemoveOccurencesOfZero {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        Collections.addAll(a,2,2,3,4,2,6,8);


        removeAllOccurencesOfTwo(a);

        System.out.println("The length of array after removal is:" + a.size());
    }

    public static void removeAllOccurencesOfTwo(ArrayList<Integer> a){

        int element = 2;

       a.removeIf(num -> num == element);

       for(int num : a){

           System.out.println(num);
       }

    }
}



