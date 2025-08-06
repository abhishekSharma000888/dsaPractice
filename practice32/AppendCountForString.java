package practice32;

import java.util.LinkedHashMap;

public class AppendCountForString {
    public static void main(String[] args) {

        String input = "morning";
        //replace character if count is greater than 1

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: input.toCharArray()){
            h1.put(ch, h1.getOrDefault(ch,0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()){

            int count = h1.get(ch);
            if(count> 1){
                sb.append(count);
            } else {
                sb.append(ch);
            }

        }
        System.out.println(sb);


    }
}
