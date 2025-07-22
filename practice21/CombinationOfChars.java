package practice21;

import java.util.ArrayList;

public class CombinationOfChars {
    public static void main(String[] args) {

        String s = "I Love Dogs";

        s = s.replaceAll(" ", "");

        ArrayList<String> a1 = new ArrayList<>();


        for (int i = 0; i < s.length() - 1; i++) {  // up to length - 1 to avoid out of bounds
            String pair = "" + s.charAt(i) + s.charAt(i + 1);

            if (!a1.contains(pair)) {
                a1.add(pair);
            }
        }

        System.out.println(a1);
    }
}
