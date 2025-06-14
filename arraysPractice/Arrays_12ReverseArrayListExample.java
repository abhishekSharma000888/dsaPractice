package arraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_12ReverseArrayListExample {
    /**
     * Reverses an ArrayList by rotating it right by 'k' steps.
     * @param list The ArrayList to be reversed
     * @param k    The number of steps to rotate right
     */
    public static void reverseArrayList(ArrayList<Integer> list, int k) {
        // Edge case handling: return early if list is null, empty, or k is invalid
        if (list == null || list.isEmpty() || k <= 0) return;

        // Adjust k to handle cases where k > list.size()
        k = k % list.size();  // Ensures k is within bounds [0, list.size()-1]

        // Step 1: Reverse the first part (elements before the rotation point)
        Collections.reverse(list.subList(0, list.size() - k));

        // Step 2: Reverse the second part (elements to be rotated)
        Collections.reverse(list.subList(list.size() - k, list.size()));

        // Step 3: Reverse the entire list to complete the rotation
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        // Initialize an ArrayList with sample values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Rotate the list right by 2 steps
        reverseArrayList(list, 2);

        // Print the result: [4, 5, 1, 2, 3]
        System.out.println(list);
    }

}
