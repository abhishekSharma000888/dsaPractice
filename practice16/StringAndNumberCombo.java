package practice16;

import java.util.LinkedHashMap;

public class StringAndNumberCombo {

    public static void main(String[] args) {

        String[] list1 = {"Apple","Banana","Kiwi"};
        int[] list2 = {2,3,4};

        LinkedHashMap<String, Integer> h1 = new LinkedHashMap<>();

        for( int i=0; i<list1.length; i++){

            h1.put(list1[i], list2[i]);
        }

        System.out.println(h1);
    }
}
