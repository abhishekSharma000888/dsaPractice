package practice22;

import java.util.LinkedHashMap;

public class CharacterCount {

    public static void main(String[] args) {

        String input = "asdscza";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: input.toCharArray()){

            h1.put(ch, h1.getOrDefault(ch, 0)+1);
        }
        h1.forEach((key,value)->{

            System.out.println(key + "-"+ value);
        });
    }
}
