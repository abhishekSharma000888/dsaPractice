package practice1;

import java.util.HashMap;
import java.util.Map;

public class ConvertString02 {

    public static void main(String[] args) {

        String input = "tomorrow";

        Map<Character, Integer> h1= new HashMap<>();

        for(char c: input.toCharArray()) {

            h1.put(c, h1.getOrDefault(c, 0) + 1);

        }

        StringBuilder result = new StringBuilder();

        for(char c: input.toCharArray()){

            result.append(h1.get(c)>1 ? h1.get(c) : c);
        }


        System.out.println(result.toString());
    }
}
