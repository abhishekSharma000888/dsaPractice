package practice7;

import java.util.LinkedHashMap;

public class ProgramToCountOccurences {

    public static void main(String[] args) {

        String str1 = "ABCCD";
        String str2 = "DAB";

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: sb.toString().toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+1);
            }

        }

        h1.forEach((key,value)->{
            System.out.println(key + ":"+ value);
        });

    }
}
