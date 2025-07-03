package practice12;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueElements {

    public static void main(String[] args) {

        String input = "rtrrutwe";

       ArrayList<Character> sb = new ArrayList<>();
        HashMap<Character,Integer> h1 = new HashMap<>();

        for(char ch: input.toCharArray()){

            h1.put(ch, h1.getOrDefault(ch, 0)+1);
        }
        System.out.println(h1);

        h1.forEach((key,value) ->{

            if(value == 1){

              sb.add(key);
            }
        });

        System.out.println(sb);
    }
}
