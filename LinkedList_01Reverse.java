import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_01Reverse {
    public static void main(String[] args) {

        // Test 1: Normal list
        LinkedList<Integer> list1 = new LinkedList<>();
        Collections.addAll(list1, 1, 2, 3, 4);
        reverseAndPrint(list1);  // Expected: [4, 3, 2, 1]

        // Test 2: Single-node list
        LinkedList<Integer> list2 = new LinkedList<>();
        Collections.addAll(list2, 99);
        reverseAndPrint(list2);  // Expected: [99]

        // Test 3: Empty list
        LinkedList<Integer> list3 = new LinkedList<>();
        reverseAndPrint(list3);  // Expected: []
    }

    public static void reverseAndPrint(LinkedList<Integer> list) {
        System.out.println("Original list: " + list);

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }

        System.out.println("Reversed list: " + list);
        System.out.println();
    }
}