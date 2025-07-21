package practice23;

import java.util.HashSet;

public class LongestSubstring {

        public static void main(String[] args) {
            String input ="abcabcbb";
            System.out.println("The longest non-repeating input string is: "+
                    longestNonRepeatingString(input));
        }

        public static String longestNonRepeatingString(String s){

            int i=0, j=0, startIndex=0, maxLength=0;

            HashSet<Character> h1 = new HashSet<>();

            while(j<s.length()){

                if(!h1.contains(s.charAt(j))){
                    h1.add(s.charAt(j));
                    j++;
                    if(j-i+1 > maxLength){
                        maxLength = j - i + 1;
                        startIndex=i;
                    }
                } else {
                    h1.remove(s.charAt(i));
                    i++;
                }
            }
            return s.substring(startIndex,startIndex + maxLength);
        }


}
