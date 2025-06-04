package arraysPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_08RotateArray {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        // Initial array
        Collections.addAll(a, 1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println("Original array:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the 'K' steps to rotate the array by:");
        int k = sc.nextInt();
        sc.close();

        if (k < 1) {
            System.out.println("K should be a positive integer!");
            return;
        }

        rotateTheArray(a, k);

        System.out.println("Rotated array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    // Rotate the array to the right by k steps
    public static void rotateTheArray(ArrayList<Integer> list, int k) {
        int n = list.size();
        k = k % n; // In case k > n

        if (k == 0) return;

        // Rotate using reverse algorithm
        reverse(list, 0, n - 1);
        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
    }

    private static void reverse(ArrayList<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
