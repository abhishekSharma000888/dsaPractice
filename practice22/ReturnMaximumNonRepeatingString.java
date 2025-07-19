package practice22;

import java.util.HashSet;

public class ReturnMaximumNonRepeatingString {

    public static void main(String[] args) {

        String input = "abcabcbb";
        System.out.println("The maximum non-repitative substring is: "+
                longestNonRepitative(input));
    }

    public static String longestNonRepitative(String s){

        int i=0, j=0, maxLength=0, startIndex=0;

        HashSet<Character> set = new HashSet<>();


        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                if (j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    startIndex = i;
                }
                j++;
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return s.substring(startIndex,startIndex+ maxLength);
    }
}
