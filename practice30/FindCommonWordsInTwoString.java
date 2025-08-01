package practice30;

import java.util.LinkedHashMap;

public class FindCommonWordsInTwoString {

    public static void main(String[] args) {
        //find common elements in two arrays

        String[] arr1={"one","two","five","nine","eight"};
        String[] arr2={"one","four","five","eight","ten"};

        LinkedHashMap<String,Integer> h1 = new LinkedHashMap<>();

        for(String word: arr1){

            h1.put(word, h1.getOrDefault(word, 0)+ 1);
        }

        for(String word: arr2){

            if(h1.containsKey(word)){

                h1.put(word, h1.getOrDefault(word, 0)+ 1);
            }
        }

        h1.forEach((key,value)->{
            if(value>1){
                System.out.println(key);
            }
        });


    }
}
