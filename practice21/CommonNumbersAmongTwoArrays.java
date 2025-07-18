package practice21;

import java.util.HashSet;

public class CommonNumbersAmongTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for(int num: arr1){

            h1.add(num);
        }

        for(int number: arr2){

            if(h1.contains(number)){

                h2.add(number);
            }
        }
        System.out.println(h2);

    }
}
