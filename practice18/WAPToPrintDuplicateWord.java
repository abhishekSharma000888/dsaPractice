package practice18;

import java.util.LinkedHashMap;

public class WAPToPrintDuplicateWord {

    public static void main(String[] args) {

        String input = "Java is great and Java is powerful and Java is popular";
        String[] words = input.split(" ");

        LinkedHashMap<String,Integer> h1 = new LinkedHashMap<>();

        for(String word: words){

            h1.put(word, h1.getOrDefault(word, 0)+1);
        }

        h1.forEach((key,value)->{

            if(value >1){

                System.out.println(key);
            }
        });
    }
}
