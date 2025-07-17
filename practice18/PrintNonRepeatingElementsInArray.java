package practice18;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class PrintNonRepeatingElementsInArray {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        LinkedHashMap<Integer, Integer> h1 = new LinkedHashMap<>();
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int num : arr) {

            h1.put(num, h1.getOrDefault(num, 0) + 1);
        }

        h1.forEach((key, value) -> {
            if (value == 1) {
                a1.add(key);
            }
        });
        System.out.println(a1);
    }
}
