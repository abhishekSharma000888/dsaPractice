package practice5;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharCountExample {

    public static void main(String[] args) {

        String input = "aabbcccdd";

        input = input.toLowerCase();

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0) +1);
            }
        }

        System.out.println(h1);

        h1.forEach((key,value) ->{
            System.out.print(key.toString()+value.toString());
        });
    }
}
