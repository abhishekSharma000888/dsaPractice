package practice17;

import java.util.LinkedHashMap;

public class CountOccurenceOfWords {
    public static void main(String[] args) {

        String[] arr1={"one","two","five","nine","eight"};
        String[] arr2={"one","four","five","eight","ten"};

        //to find common elements

        LinkedHashMap<String,Integer> h1 = new LinkedHashMap<>();

        for(int i=0;i<arr1.length; i++){
            h1.put(arr1[i], h1.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<arr2.length; i++){
            h1.put(arr2[i], h1.getOrDefault(arr2[i],0)+1);
        }

        h1.forEach((key,value) ->{
            if(value >1){

                System.out.println(key + " occured "+ value);
            }
        });

    }
}
