package practice17;

import java.util.HashSet;

public class LongestNonRepeatingString {

    public static void main(String[] args) {

        String input = "abcabcbb";

        System.out.println("The longest substring without repeating characters is: "+ longestSubstring(input));
    }

    public static int longestSubstring(String s){

        int i=0; int max=0; int j=0;

        HashSet<Character> h1 = new HashSet<>();

        while(j<s.length()){
            if(!h1.contains(s.charAt(j))){

                h1.add(s.charAt(j));
                max = Math.max(max, j-i+1);
                j++;
            } else {
                h1.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
