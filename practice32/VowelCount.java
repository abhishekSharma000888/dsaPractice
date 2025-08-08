package practice32;

import java.util.LinkedHashMap;

public class VowelCount {
    public static void main(String[] args) {
        String str="Learning automation is easy";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            if(ch !=' '){

                if(ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
                    h1.put(ch, h1.getOrDefault(ch, 0)+1);
            }
        }

        System.out.println(h1);

    }
}
