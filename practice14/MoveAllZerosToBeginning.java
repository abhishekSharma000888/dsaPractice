package practice14;

import java.util.ArrayList;

public class MoveAllZerosToBeginning {

    public static void main(String[] args) {

        int[] a1 = {1,0,2,0,3,4,0,5,6,0,7};

        ArrayList<Integer> outputArray = new ArrayList<>();

        for(int i=0; i<a1.length; i++){

            if(a1[i] == 0){

                outputArray.add(a1[i]);
            }
        }

        for(int i=0; i<a1.length; i++){

            if(a1[i] != 0){

                outputArray.add(a1[i]);
            }
        }

        System.out.println(outputArray);
    }
}
