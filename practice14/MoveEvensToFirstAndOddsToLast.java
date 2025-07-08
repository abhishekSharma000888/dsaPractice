package practice14;

import java.util.ArrayList;

public class MoveEvensToFirstAndOddsToLast {

    public static void main(String[] args) {

        int[] arr = {1, 4, 7, 2, 9, 6, 5, 8};

        ArrayList<Integer> a1 = new ArrayList<>();

        for(int num: arr){

            if(num%2 ==0){

                a1.add(num);
            }
        }

        for(int num: arr){

            if(num %2 !=0){
                a1.add(num);
            }
        }

        System.out.println(a1);

    }
}
