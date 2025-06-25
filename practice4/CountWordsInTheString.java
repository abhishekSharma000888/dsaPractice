package practice4;

import java.util.HashMap;

public class CountWordsInTheString {

    public static void main(String[] args) {

        String input = "Java sucks when you don't practice";

        input = input.trim();

        int count = 0;

        String[] uniqueWords = input.split(" ");

       for(String word: uniqueWords){

           count ++;
       }

       System.out.println(count);

    }
}
