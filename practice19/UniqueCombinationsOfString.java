package practice19;

import java.util.ArrayList;

public class UniqueCombinationsOfString {

    public static void main(String[] args) {

        String input = "I Love Dogs";
        input = input.replaceAll(" ", "");

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                result.add("" + input.charAt(i) + input.charAt(j));
            }
        }
        System.out.println(result);
    }
}
