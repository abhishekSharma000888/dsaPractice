package practice21;

import java.util.HashSet;

public class MaximumNonRepeatingSubstring {

    public static void main(String[] args) {

        String input = "abcabcbb";

        System.out.println("The longest substring without repeating chars: " + longestNonRepeatingSubstring(input));
    }

    public static String longestNonRepeatingSubstring(String s){

        int i=0, j=0,maxLength=0, startIndex=0;

        HashSet<Character> h1 = new HashSet<>();

        while(j<s.length()){
            if(!h1.contains(s.charAt(j))){
                h1.add(s.charAt(j));


                if(j -i + 1> maxLength){

                    maxLength = j -i + 1;
                    startIndex=i;
                }
                j++;
            } else{
                h1.remove(s.charAt(i));
                j++;
            }

        }
        return s.substring(startIndex, startIndex + maxLength);
    }
}
