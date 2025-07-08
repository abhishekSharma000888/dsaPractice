package practice16;

import java.util.LinkedHashSet;

public class FindVowels {
    public static void main(String[] args) {
        String input ="Your name";
        input = input.toLowerCase();

        LinkedHashSet<Character> h1 = new LinkedHashSet<>();

        for(char ch: input.toCharArray()){

            if(ch != ' '){

                if(ch == 'a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                    h1.add(ch);
                }
            }
        }

        System.out.println("Output: " + h1);
    }
}
