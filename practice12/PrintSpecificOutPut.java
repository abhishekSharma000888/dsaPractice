package practice12;

import java.util.ArrayList;
import java.util.Collections;

public class PrintSpecificOutPut {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        Collections.addAll(a1,1234,2132,5455,987,6543);

        for(int num: a1){

            System.out.println("Selenium:" + num);

        }

    }
}
