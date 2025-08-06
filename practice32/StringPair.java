package practice32;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringPair {
    public static void main(String[] args) {
        String s = "I Love Dogs";
        s = s.replace(" ", "");

        Set<String> pairs = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                char a = s.charAt(i);
                char b = s.charAt(j);

                if (a != b) {
                    String pair = "" + a + b;
                    pairs.add(pair);
                }
            }
        }

        System.out.println(pairs);
    }
}
