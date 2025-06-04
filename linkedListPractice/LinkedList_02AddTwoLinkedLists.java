package linkedListPractice;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_02AddTwoLinkedLists {

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        Collections.addAll(l1, 1,3,5);

        LinkedList<Integer> l2 = new LinkedList<>();

        Collections.addAll(l2, 2,4,6);

        Collections.sort(l1);
        Collections.sort(l2);

        LinkedList<Integer> l3 = new LinkedList<>();

        l3.addAll(l1);
        l3.addAll(l2);

        Collections.sort(l3);

        for(int num: l3){
            System.out.println(num);
        }


    }
}
