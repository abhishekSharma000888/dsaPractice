package practice18;

import java.util.LinkedHashMap;

public class WAPToPrintOccurencesOfAnElement {

    public static void main(String[] args) {

        int[] arr = {3, 5, 3, 2, 5, 6, 7, 3, 2, 8, 5};

        LinkedHashMap<Integer, Integer> h1 = new LinkedHashMap<>();

        for(int num: arr){

            h1.put(num, h1.getOrDefault(num ,0)+1);
        }

        h1.forEach((key,value) ->{

            System.out.println("Element "+ key + " Occurs "+ value);
        });
    }
}
