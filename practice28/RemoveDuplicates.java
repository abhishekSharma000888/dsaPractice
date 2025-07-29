package practice28;

import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashSet<Integer> h1 = new HashSet<>();

        for (int num : arr) {

            h1.add(num);
        }

        System.out.println(h1);
    }
}