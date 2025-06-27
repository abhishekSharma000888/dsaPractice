package practice7;

import java.util.ArrayList;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {

        int[] input={1,2,0,3,5,0,4,0,0};

        ArrayList<Integer> h1 = new ArrayList<>();

        for(int num: input){

            if(num != 0){

                h1.add(num);
            }

        }

        for(int num: input){
            if(num == 0){

                h1.add(num);
            }
        }

        System.out.println(h1);
    }
}
