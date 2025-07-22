package practice20;

import java.util.ArrayList;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {

        int[] l1 = {1, 0, 2, 0, 3, 4, 0, 5, 6, 0, 7};

        //move all zeros to the end

        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < l1.length; i++) {

            if (l1[i] != 0) {
                a1.add(l1[i]);
            }
        }
        for (int i = 0; i < l1.length; i++) {

            if (l1[i] == 0) {
                a1.add(l1[i]);
            }
        }
        System.out.println(a1);
    }

    }
