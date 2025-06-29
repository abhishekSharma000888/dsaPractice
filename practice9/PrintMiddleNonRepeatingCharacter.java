package practice9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class PrintMiddleNonRepeatingCharacter {

    public static void main(String[] args) {

        String input = "switchas switches que testing";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        ArrayList<Character> a1 = new ArrayList<>();

        for(char ch: input.toCharArray()){

            h1.put(ch, h1.getOrDefault(ch,0) +1);
        }

        h1.forEach((key,value) ->{

            if(value ==1){

                System.out.print(key);

                a1.add(key);

            }
        });

        int n = a1.size()/2;

       System.out.println("The middle element is:" + a1.get(n));
       }

}
