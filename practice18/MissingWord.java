package practice18;

import java.util.HashMap;

public class MissingWord {
    public static void main(String[] args) {

        String[] Expected = {"A", "B", "C", "D"};
        String[] Actual=   {"A", "C", "D"};


        HashMap<String, Integer> h1 = new HashMap<>();

        for(String word: Expected){

            h1.put(word, h1.getOrDefault(word, 0)+1);
        }
        for(String word: Actual){

            h1.put(word, h1.getOrDefault(word, 0)+1);
        }

        h1.forEach((key,value) ->{
            if(value ==1){
                System.out.println("The missing word is:" + key);
            }
        });

    }
}
