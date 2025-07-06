package practice13;

import java.util.ArrayList;

public class OddOrEven {
    public static void main(String[] args) {
        int[] input= {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int i=1; i<input.length; i++){

            if(input[i]%2 == 0){
                oddList.add(i);
            } else{
                evenList.add(i);
            }
        }

        System.out.println("Odd List is: "+ oddList);
        System.out.println("Even List is: "+ evenList);


    }
}
