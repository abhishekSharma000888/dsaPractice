package practice17;

import java.util.ArrayList;

public class PrintEvenIndexedChar {

    public static void main(String[] args) {

        String input = "reverse each char";

        ArrayList<Character> a1 = new ArrayList<>();

        for(int i=0; i< input.length(); i++){

            if (i % 2 == 0) {
                a1.add(input.charAt(i));  // Corrected this line
            }
        }

        System.out.println(a1);
    }
}
