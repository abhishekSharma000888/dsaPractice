package practice9;

import java.util.ArrayList;

public class CountCharactersWithoutUsingMap {

    public static void main(String[] args) {

        String input = "aaabbbccc";

        int acount = 0;

        int bcount = 0;

        int ccount = 0;

        ArrayList<Integer> a1 = new ArrayList<>();

        for(char ch: input.toCharArray()){

            if(ch =='a'){

                acount ++;
            } else if (ch == 'b') {

                bcount ++;

            } else {

                ccount ++;
            }
        }

        System.out.println("a" + ":" + acount);
        System.out.println("b" + ":" + bcount);
        System.out.println("c" + ":" + ccount);

    }
}
