package practice11;

import java.util.LinkedHashMap;

public class DulicateCharacters {

    public static void main(String[] args) {

        String input = "programming language";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+1);
            }
        }

        h1.forEach((key,value) ->{
            if(value >1){

                sb.append(key);
            }
        });

        System.out.println(sb);
    }
}
