package practice1;

import java.util.HashMap;
import java.util.Map;

public class ConvertString {

    public static void main(String[] args) {

        String input = "tomorrow";

        Map<Character, Integer> freqMap = new HashMap<>();

        //First we will count the frequency of each character

        for(char c: input.toCharArray()){

            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        System.out.println(freqMap);

        // we will build the final String

        StringBuilder result = new StringBuilder();

        for(char c : input.toCharArray()){

            int freq = freqMap.get(c);

            if(freq>1){

                result.append(freq);
            } else {

                result.append(c);

            }
        }

        System.out.println(result);
    }
}
