package practice4;

import java.util.HashMap;

public class DuplicateCharactersInString {

    public static void main(String[] args) {

        String input = "To find duplicate characters in the string.".toLowerCase();

        HashMap<Character, Integer> h1 = new HashMap<>();

        for(char ch: input.toCharArray()){

            if(ch != ' '){

                h1.put(ch, h1.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println(h1);

        h1.forEach((key,value) ->{
            if(value>1){

                System.out.println("key:" + key+ "value:" + value);
            }
        });
    }
}
