package practice19;

import java.util.LinkedHashMap;

public class CountOfEachVowel {
    public static void main(String[] args) {

        String input ="Learning automation is easy";
        input = input.toLowerCase();
        LinkedHashMap<Character,Integer> h1= new LinkedHashMap<>();

        for(char ch: input.toCharArray()){
            if(ch != ' '){
                if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    h1.put(ch, h1.getOrDefault(ch,0) +1);
                }
            }
        }

        System.out.println(h1);
    }
}
