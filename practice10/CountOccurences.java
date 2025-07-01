package practice10;

import java.util.LinkedHashMap;

public class CountOccurences {

    public static void main(String[] args) {

        String str1 = "ABCD";

        String str2 = "DAB";

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();
        for(char ch: sb.toString().toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+ 1);
            }
        }

       System.out.println(h1);
    }
}
