package practice16;

import java.util.HashMap;

public class CountOccurencesOfIntegers {
    public static void main(String[] args) {

        int[] input = {200, 404, 200, 500, 404, 200};

        HashMap<Integer,Integer> h1 = new HashMap<>();

        for(int num: input){

            h1.put(num, h1.getOrDefault(num, 0)+1);

        }

        System.out.println(h1);
    }
}
