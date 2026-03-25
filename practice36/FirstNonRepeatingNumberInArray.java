package practice36;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingNumberInArray {

    /**
     * Finds the first non-repeating number in an array
     * @param arr integer array
     * @return first non-repeating number or -1 if none exists
     */
    public static int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find first number with frequency 1
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};

        int result = findFirstNonRepeating(arr);

        if (result != -1) {
            System.out.println("First non-repeating number: " + result);
        } else {
            System.out.println("No non-repeating number found.");
        }
    }
}