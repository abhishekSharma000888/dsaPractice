package interviewPracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveOccurencesOfAnelement {


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        Collections.addAll(arr, 2, 2, 3, 4, 2, 6, 8);

        int n=2;

        for(int i=0; i<arr.size(); i++){

           if(arr.get(i) == n){

               arr.remove(i);

            }
        }
        System.out.println("The length after removal is: "+ arr.toArray().length);
    }
}
