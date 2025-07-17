package practice20;

import java.util.ArrayList;

public class ProgramToFindAllCombinations {
    public static void main(String[] args) {

        String s = "I Love Dogs";
        s = s.replaceAll(" ", "");  // Remove spaces

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String pair = s.charAt(i) + "" + s.charAt(j);
                result.add(pair);
            }
        }

        System.out.println(result);
    }
}
