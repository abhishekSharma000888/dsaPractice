package practice30;

import java.util.LinkedHashMap;

public class ArrayMergeAndSort {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        LinkedHashMap<Integer,Integer> h1 = new LinkedHashMap();

        for(int i=0; i<arr1.length; i++){

            h1.put(arr1[i], h1.getOrDefault(arr1[i], 0)+1);
        }

        for(int i=0; i<arr2.length; i++){

            h1.put(arr2[i], h1.getOrDefault(arr2[i], 0)+1);
        }

        h1.forEach((key,value) ->{
            if(value>1){

                System.out.println(key);
            }
        });

    }
}
