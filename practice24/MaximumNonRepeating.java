package practice24;

import java.util.HashSet;

public class MaximumNonRepeating {
    public static void main(String[] args) {

        String input = "pwwkew";

        System.out.println("The longest substring is: "+ longestSubstring(input));

    }
    public static String longestSubstring(String s){

        int i=0,j=0,maxLength=0,startIndex=0;

        HashSet<Character> h1 = new HashSet<>();
        while(j<s.length()){

            if(!h1.contains(s.charAt(j))){
                h1.add(s.charAt(j));

                if(j-i+1 > maxLength){
                    maxLength = j-i+1;
                    startIndex=i;
                }
                j++;
            } else{

                h1.remove(s.charAt(i));
                i++;
            }

        }
        return s.substring(startIndex, startIndex + maxLength);
    }
}
