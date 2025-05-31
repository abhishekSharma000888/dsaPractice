import java.util.ArrayList;

public class Arrays_06MoveZeroesToEnd {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(0);
        a.add(1);
        a.add(0);
        a.add(3);
        a.add(12);

        System.out.println("Original Array: " + a);

        moveZeroesToEnd(a);

        System.out.println("After moving zeroes: " + a);
    }

    public static void moveZeroesToEnd(ArrayList<Integer> list) {
        int index = 0; // Position for next non-zero

        // First pass: move non-zero elements to the front
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != 0) {
                list.set(index, list.get(i));
                index++;
            }
        }

        // Second pass: fill remaining with 0s
        while (index < list.size()) {
            list.set(index, 0);
            index++;
        }
    }
}
