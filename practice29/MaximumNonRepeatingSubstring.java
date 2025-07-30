package practice29;

import java.util.HashSet;

public class MaximumNonRepeatingSubstring {

    public static void main(String[] args) {

        String input = "aabcaab";
        //find the longest non repeating substring

        System.out.println("The non-repeatin string is: " + longestNonRepeating(input));
    }

    public static String longestNonRepeating(String s){

        int i=0,j=0,maxLength=0,startIndex=0;

        HashSet<Character> h1 = new HashSet<>();

        while(j<s.length()){

            if(!h1.contains(s.charAt(j))){

                h1.add(s.charAt(j));

                if(maxLength< j-i + 1){
                    maxLength = j - i + 1;
                    startIndex = i;
                }
                j++;
            } else {

                h1.remove(s.charAt(j));
                j++;
            }
        }
        return s.substring(startIndex,startIndex+maxLength);
    }
}
