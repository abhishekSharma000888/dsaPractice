package practice16;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MissingKey {

    public static void main(String[] args) {

        String[] expected= {"A", "B", "C", "D","E"};
        String[] actual=   {"A", "C", "D"};
        ArrayList<String> missing = new ArrayList<>();
        LinkedHashMap<String,Integer> h1 = new LinkedHashMap<>();

        for(String word : expected){
            h1.put(word, h1.getOrDefault(word, 0)+1);
        }
        for(String word : actual){
            h1.put(word, h1.getOrDefault(word, 0)+1);
        }

        h1.forEach((key,value)->{
            if(value ==1){
                missing.add(key);
            }
        });

        System.out.println(missing);

    }
}
