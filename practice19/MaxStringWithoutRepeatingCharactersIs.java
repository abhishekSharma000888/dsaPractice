package practice19;

import java.util.HashSet;

public class MaxStringWithoutRepeatingCharactersIs {

    public static void main(String[] args) {

        String input = "abcabcbb";
        System.out.println("The maximum substring without repeating characters is: " + findTheMaximumSubstring(input));

    }

    public static String findTheMaximumSubstring(String s){

        int i=0,j=0,maxLength=0, start=0;

        HashSet<Character> h1 = new HashSet<>();

        while(j < s.length()){

            if(!h1.contains(s.charAt(j))){
                h1.add(s.charAt(j));
                if(j-i+1 > maxLength){
                    maxLength = j-i+1;
                    start =i;
                }
                j++;
            } else {
                h1.remove(s.charAt(i));
                i++;
            }
        }
        return s.substring(start, start +maxLength);
    }
}
