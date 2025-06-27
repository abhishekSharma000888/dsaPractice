package practice7;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class FindUniqueElementsFromAnArray {

    public static void main(String[] args) {

        int[] arr = {7, 8, 7, 9, 10, 11, 9, 12, 11, 13, 13, 14};

        LinkedHashMap<Integer,Integer> h1 = new LinkedHashMap<>();


        for(int num: arr){

            h1.put(num, h1.getOrDefault(num,0)+1);
        }

        System.out.println(h1);

        h1.forEach((key,value) -> {
            if(value ==1){

                System.out.println(key);
            }
        });
    }
}
