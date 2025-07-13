package practice17;

import java.util.LinkedHashMap;

public class SpecificOutput {

    public static void main(String[] args) {

        //To assign values
        String[] lst1 ={"Apple","Banana","Kiwi"};
        int[] lst2 = {2,3,4};

        LinkedHashMap<String,Integer> h1 = new LinkedHashMap<>();

        for(int i=0; i<lst1.length; i++){

            h1.put(lst1[i], lst2[i]);
        }

        System.out.println(h1);
    }
}
