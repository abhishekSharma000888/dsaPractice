package practice24;

import java.util.ArrayList;

public class StringCombinations {
    public static void main(String[] args) {

        String input = "I Love Dogs";
        input = input.replaceAll(" ", "");
        ArrayList<String> a1 = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            for (int j = i + 1; j < input.length(); j++) {

                a1.add("" + input.charAt(i) + input.charAt(j));
            }
        }
        System.out.println(a1);
    }
}
