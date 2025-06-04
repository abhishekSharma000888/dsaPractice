package linkedListPractice;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_01Reverse {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        Collections.addAll(l1, 1, 2, 3, 2);

        Collections.reverse(l1);

        for (int num : l1) {

            System.out.println(num);

        }
    }
}