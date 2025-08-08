package practice33;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class CommonWords {
    public static void main(String[] args) {

        String s1 = "Java is great, and Selenium with Java is powerful!";
        String s2 = "Many QA engineers find Selenium with Java very effective.";

        String[] wordsOne = s1.split(" ");
        String[] wordsTwo = s2.split(" ");

        LinkedHashMap<String,Integer> h1 = new LinkedHashMap<>();
        HashSet<String> h2 = new HashSet<>();

        for(String word: wordsOne){

            h1.put(word, h1.getOrDefault(word, 0) +1);
        }

        for(int i=0; i<wordsTwo.length; i++){

            if(h1.containsKey(wordsTwo[i])){
                h2.add(wordsTwo[i]);
            }
        }
        System.out.println("The common words are");
        System.out.println(h2);

    }

}
