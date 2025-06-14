package arraysPractice;

import java.util.ArrayList;

public class Arrays_04Reverse {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        System.out.println("Original Array: " + a);

        // Reverse the list in-place
        reverseArray(a);

        System.out.println("Reversed Array: " + a);
    }

    public static void reverseArray(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
