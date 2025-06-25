package practice3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindTheDuplicateCharacterInTheString {

    public static void main(String[] args) {

        String input = "Nothing is duplicate in this String!";

       input = input.toLowerCase();

       Map<Character, Integer> charCountMap = new HashMap<>();

       for(char ch: input.toCharArray()){

           if(Character.isLetterOrDigit(ch)){

               charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
           }
       }

        System.out.println("Duplicate characters are:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }

    }
}
