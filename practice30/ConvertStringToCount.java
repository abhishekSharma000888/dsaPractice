package practice30;

import java.util.LinkedHashMap;

public class ConvertStringToCount {

    public static void main(String[] args) {
        //program to count occurences of characters and replace
        //if the count is greater than one

        String input= "Good morning";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: input.toCharArray()){

            h1.put(ch,h1.getOrDefault(ch,0)+1);

        }
        // System.out.println(h1);

        StringBuilder result = new StringBuilder();

        for(char ch: input.toCharArray()){

            int count = h1.get(ch);
            if(count>1){
                result.append(count);
            } else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());




    }
}
