package practice15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindFirstNonRepeatingChar {

    public static void main(String[] args) {

        String input = "Software Testing";

        input = input.toLowerCase();

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+1);
            }

        }
        System.out.println(h1);

        ArrayList<Character> a1 = new ArrayList<>();

        h1.forEach((key,value) ->{
            if(value ==1){

                a1.add(key);
            }
        });

        System.out.println("The first non repeating character is: " + a1.get(0));
    }
}
