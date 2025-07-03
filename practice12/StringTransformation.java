package practice12;

import java.util.LinkedHashMap;

public class StringTransformation {

    public static void main(String[] args) {

        String input = "tomorrow";

        LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<>();
        StringBuilder finalOutput = new StringBuilder();

        // Build frequency map
        for (char ch : input.toCharArray()) {
            h1.put(ch, h1.getOrDefault(ch, 0) + 1);
        }

        // Transform the string based on frequencies
        for(char ch: input.toCharArray()){

            int frequency = h1.get(ch);

            if(frequency>1){

                finalOutput.append(frequency);
            } else {
                finalOutput.append(ch);
            }
        }

        System.out.println(finalOutput);
    }
}
