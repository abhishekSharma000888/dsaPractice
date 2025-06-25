package practice3;

import java.util.HashMap;

public class CountCharactersInTheString {

    public static void main(String[] args) {

        String input = "India";

        input = input.toLowerCase();

        HashMap<Character, Integer> h1 = new HashMap<>();

        for(char ch: input.toCharArray()){

            if(ch != ' '){

                h1.put(ch, h1.getOrDefault(ch,0) +1);
            }


        }
        System.out.println("Printing the occurence of the characters:");

        h1.forEach((key,value) -> {

                    System.out.println(key + ' ' + value);
                }
                );
    }
}
