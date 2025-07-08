package practice16;

import java.util.ArrayList;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 2, 0, 3, 4, 0, 5, 6, 0, 7};

        ArrayList<Integer> arr2 = new ArrayList<>();

        for (int number : arr1) {
            if (number != 0) {

                arr2.add(number);
            }
        }

        for (int number : arr1) {
            if (number == 0) {

                arr2.add(number);
            }
        }


        System.out.println(arr2);
    }
}
