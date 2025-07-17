package practice18;

import java.util.HashSet;

public class ReturnStringwithNonRepeatingCharacters {

    public static void main(String[] args) {

        String input = "csaasccasdfdsvqasxc";
        System.out.println("The longest substring without" +
                "the repeating charaters is: " + longestSubstring(input));
        String length = longestSubstring(input).toString();
        System.out.println("The length of the string is:" + length.length());

    }

    public static String longestSubstring(String s){

        int i=0, j=0, max =0, startIndex=0;

        HashSet<Character> h1 = new HashSet<>();

        while(j< s.length()){
            if(!h1.contains(s.charAt(j))){
                h1.add(s.charAt(j));
                if(j-i+1 > max){
                    max = j-i+1;
                }
                j++;
            }else{
                h1.remove(s.charAt(i));
                i++;
            }
        }
       return s.substring(startIndex, startIndex+max);
    }
}
