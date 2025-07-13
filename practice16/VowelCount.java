package practice16;

import java.util.HashMap;

public class VowelCount {
    public static void main(String[] args) {
    String input ="Learning automation is easy";

    input = input.toLowerCase();
    HashMap<Character,Integer> h1 = new HashMap<>();


        for(char ch: input.toCharArray()){

        if(ch =='a'||ch =='e' ||ch =='i' ||ch =='o'|| ch =='u'){

            h1.put(ch, h1.getOrDefault(ch, 0) +1);
        }
    }

        h1.forEach((key,value)->{
        System.out.println(key + " occured "+ value);
    });
}
}
