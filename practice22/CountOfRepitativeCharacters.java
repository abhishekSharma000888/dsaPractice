package practice22;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CountOfRepitativeCharacters {

    public static void main(String[] args) {

        String input = "Sachin Ramesh Tendulkar";
        input = input.toLowerCase();

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();
        ArrayList<Character> a1 = new ArrayList<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){
                h1.put(ch, h1.getOrDefault(ch, 0)+1);
            }
        }
        h1.forEach((key,value)->{

            if(value>1){
                a1.add(key);
            }
        });

        int count = a1.size();
        System.out.println("The count of repetative characters is: "+ count);
    }

}
