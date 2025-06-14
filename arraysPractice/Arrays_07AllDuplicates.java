package arraysPractice;

import java.util.ArrayList;

public class Arrays_07AllDuplicates {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(4);
        a.add(3);
        a.add(2);
        a.add(7);
        a.add(8);
        a.add(2);
        a.add(3);
        a.add(1);

        findAllDuplicates(a);
    }

    private static void findAllDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> printed = new ArrayList<>();

        System.out.println("Duplicate elements:");

        for (int i = 0; i < list.size(); i++) {
            Integer current = list.get(i); // fixed here

            if (printed.contains(current)) {
                continue;
            }

            for (int j = i + 1; j < list.size(); j++) {
                if (current.equals(list.get(j))) {
                    System.out.println(current);
                    printed.add(current);
                    break;
                }
            }
        }
    }
}
