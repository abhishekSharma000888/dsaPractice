package practice10;

import java.util.LinkedHashMap;

public class DuplicateCharactersInAString {

    public static void main(String[] args) {

        String input = "this is a string to find the duplicate characters.";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+ 1);
            }
        }

        h1.forEach((key,value) ->{
            if(value>1){

                System.out.println("key: "+ key + ":" + "value: " + value);
            }
        });
    }
}
