package practice1;

import java.util.HashMap;

public class FindTheUniqueCharacters {

    public static void main(String[] args) {

        String input = "rtrrutwe";

        HashMap<Character, Integer> h1 = new HashMap<>();

        for(char c : input.toCharArray()){

            h1.put(c, h1.getOrDefault(c, 0)+1);


        }
        System.out.println(h1);

        StringBuilder sb = new StringBuilder();

        for(char c: input.toCharArray()){

            sb.append(h1.get(c)==1 ? c : "");
        }

        System.out.println(sb.toString());
    }
}
