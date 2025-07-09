package practice17;

import java.util.ArrayList;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr1={1,2,0,3,5,0,4,0,0};

        ArrayList<Integer> a2 = new ArrayList<>();

        for(int i=0; i<arr1.length; i++){

            if(arr1[i] != 0){
                a2.add(arr1[i]);
            }
        }

        for(int i=0; i<arr1.length; i++){

            if(arr1[i] == 0){
                a2.add(arr1[i]);
            }
        }
        System.out.println(a2);

    }
}
