package practice8;

import java.util.ArrayList;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr = {1,0,2,0,3,4,0,5,6,0,7};

        ArrayList<Integer> finalInput = new ArrayList<>();

        for(int i=0; i< arr.length; i++){

            if(arr[i] !=0){

                finalInput.add(arr[i]);
            }
        }

        for(int j=0; j< arr.length; j++){

            if(arr[j] ==0){

                finalInput.add(arr[j]);
            }
        }

        System.out.println(finalInput);
    }
}
