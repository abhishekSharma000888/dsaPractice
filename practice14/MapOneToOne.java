package practice14;

import java.util.HashMap;

public class MapOneToOne {
    public static void main(String[] args) {

        String[] a1 ={"Apple","Banana","Kiwi"};
        int[] a2 = {2,3,4};

        HashMap<String,Integer> h1 = new HashMap<>();

        for(int i=0; i< a1.length; i++){

            h1.put(a1[i],a2[i]);
        }


        System.out.println(h1);

    }
}
