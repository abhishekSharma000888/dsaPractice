package practice9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class StringCountNumberOfCharacters {

    public static void main(String[] args) {

        String input = "Sachin Ramesh Tendulkar";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        ArrayList<Character> a1 = new ArrayList<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch, 0) +1);
            }
        }

        h1.forEach((key,value) ->{

            if(value >1){

                System.out.println(key);
                a1.add(key);
            }
        });

        System.out.println("The number of repeating characters are: "+ a1.size());
    }
}
