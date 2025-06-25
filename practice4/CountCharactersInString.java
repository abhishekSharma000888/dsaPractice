package practice4;

import java.util.HashMap;

public class CountCharactersInString {

    public static void main(String[] args) {

        String input = "count occurences of each character in the given string!";

        HashMap<Character, Integer> h1 = new HashMap<>();

        for(char ch: input.toCharArray()){

            if(ch != ' '){

                h1.put(ch, h1.getOrDefault(ch, 0) +1);
            }
        }

        h1.forEach((key, value) ->{
            System.out.println(key + "=" + value);
        });
    }
}
