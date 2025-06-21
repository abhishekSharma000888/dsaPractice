package practice2;

import java.util.HashSet;

public class JavaProgramToFindOddAndEven {

    public static void main(String[] args) {

        int range = 100;

        HashSet<Integer> Odd = new HashSet<>();

        HashSet<Integer> Even = new HashSet<>();

        for(int i=1; i<=range; i++){

            if(i%2 == 0){

                Even.add(i);
            } else{

               Odd.add(i);
            }
        }

        System.out.println("Odd numbers are: " + Odd);
        System.out.println("Even numbers are: " + Even);
    }
}
