package practice9;

import java.util.Arrays;

public class RemoveSpecificElements {

    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 8, 1, 9, 1};

        // First, count how many non-1 elements are there
        int count = 0;
        for (int num : arr) {
            if (num != 1) {
                count++;
            }
        }

        // Create a new array of required size
        int[] arr2 = new int[count];
        int index = 0;

        // Fill the new array with elements that are not 1
        for (int num : arr) {
            if (num != 1) {
                arr2[index] = num;
                index++;
            }
        }

        System.out.println("The new array without 1s: " + Arrays.toString(arr2));
    }
}
