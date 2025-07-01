package practice10;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueCharactersInAString {

    public static void main(String[] args) {

        String input = "rtrrutwe";

        HashMap<Character,Integer> h1 = new HashMap<>();

        ArrayList<Character> a1 = new ArrayList<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+1);
            }
        }

        h1.forEach((key,value)->{
            if(value ==1){

                a1.add(key);
            }
        });

        System.out.println(a1);
    }
}
