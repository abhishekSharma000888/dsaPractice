package practice15;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MiddleElement {

    public static void main(String[] args) {
        String input = "switchas switches que testing";

        LinkedHashMap<Character,Integer> h1 = new LinkedHashMap<>();

        ArrayList<Character> a1 = new ArrayList<>();

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                h1.put(ch, h1.getOrDefault(ch,0)+1);
            }
        }

        h1.forEach((key,value) ->{
            if(value == 1){

                a1.add(key);
            }
        });

        int middleElement = a1.size()/2;

        char middle = a1.get(middleElement);

        System.out.println("The middle element is: "+ middle);

    }
}
