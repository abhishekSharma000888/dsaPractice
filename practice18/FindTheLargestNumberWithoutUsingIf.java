package practice18;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheLargestNumberWithoutUsingIf {

    public static void main(String[] args) {

        int a = 10;
        int b = 13;

        int largest=0;

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(a);
        a1.add(b);

        Arrays.sort(a1.toArray());


            largest = a1.get(1);


        System.out.println("The largest is:"+ largest);
    }
}
