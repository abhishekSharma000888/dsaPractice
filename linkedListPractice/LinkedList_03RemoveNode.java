package linkedListPractice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_03RemoveNode {
    public static void main(String[] args) {

    LinkedList<Integer> l1 = new LinkedList<>();
    Collections.addAll(l1, 1, 2, 3, 4, 5);

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n (position from end to remove): ");
    int n = sc.nextInt();

    if (n <= 0 || n > l1.size()) {
        System.out.println("Invalid input. n must be between 1 and " + l1.size());
    } else {
        int indexFromStart = l1.size() - n;  // Convert nth from end to 0-based index
        l1.remove(indexFromStart);          // Remove at that index
        System.out.println("Updated List: " + l1);
    }

    sc.close();
}
}