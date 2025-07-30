package practice29;

import java.util.LinkedHashMap;

public class CommonWordsAmongTwoString {

    public static void main(String[] args) {

        String str1 = "Java is a powerful language used in automation and development";
        String str2 = "Python and Java are both popular languages in development and automation";

        LinkedHashMap<String, Integer> h1 = new LinkedHashMap<>();

        String[] firstString = str1.split(" ");
        String[] SecondString = str2.split(" ");

        for(String word: firstString){

            h1.put(word, h1.getOrDefault(word,0)+1);
        }

        for(String secondWord: SecondString){

            if(h1.containsKey(secondWord)){
                h1.put(secondWord, h1.getOrDefault(secondWord,0)+1);
            }
        }

        h1.forEach((key,value) ->{
            if(value>1){
                System.out.println(key);
            }
        });
    }

}
