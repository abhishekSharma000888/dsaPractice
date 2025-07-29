package practice28;

import java.util.LinkedHashMap;

public class CountStatusCodes {
    public static void main(String[] args) {
        int[] input = {200, 404, 200, 500, 404, 200};

        LinkedHashMap<Integer,Integer> h1 = new LinkedHashMap<>();

        for(int num: input){

            h1.put(num, h1.getOrDefault(num, 0)+1);
        }

        System.out.println(h1);
    }
}
