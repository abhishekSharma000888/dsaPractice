package practice10;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CountNumberOfCharactersThatOccuredRepeatedly {

    public static void main(String[] args) {

        String input = "Sachin Ramesh Tendulkar";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();
        ArrayList<Character> a1 = new ArrayList<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+1);
            }
        }

        h1.forEach((key,value) ->{
            if(value >1){

                a1.add(key);
            }
        });

        System.out.println("The number of characters that occured repeatedly are: "+ a1.size());
    }
}
