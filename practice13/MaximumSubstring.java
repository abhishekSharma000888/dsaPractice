package practice13;

import java.util.HashSet;

public class MaximumSubstring {

    public static void main(String[] args) {

        String input = "abcabcbb";
        System.out.println("Longest substring length: "+ findLongestSubstring(input));
    }

    public static int findLongestSubstring(String s){

        int left=0, right = 0 , maxlength=0;

        HashSet<Character> set = new HashSet<>();

        while (right<s.length()){

            if(!set.contains(s.charAt(right))){

                set.add(s.charAt(right));
                maxlength = Math.max(maxlength, right -left+ 1);
                right ++;
            } else {

                set.remove(s.charAt(left));
                left++;
            }
        }
        return  maxlength;
    }
}
