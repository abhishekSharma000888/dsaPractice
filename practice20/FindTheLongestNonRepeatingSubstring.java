package practice20;

import java.util.LinkedHashSet;

public class FindTheLongestNonRepeatingSubstring {

    public static void main(String[] args) {

        String input = "abcabcbb";

        System.out.println("The maximum string without repeating characters is: " + longestSubstring(input));

    }

    public static String longestSubstring(String s){
        int i=0, j=0, maxLength=0, start =0;

        LinkedHashSet<Character> h1 = new LinkedHashSet<>();

        while(j<s.length()){
            if(!h1.contains(s.charAt(j))){
                h1.add(s.charAt(j));

                if(j-i+1 > maxLength){

                    maxLength = j - i + 1;
                }
                start = i;
                j++;
            } else {
                h1.remove(s.charAt(i));
                j++;
            }
        }

        return s.substring(start, start + maxLength);
    }
}
