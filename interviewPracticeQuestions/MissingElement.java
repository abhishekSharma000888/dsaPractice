package interviewPracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElement {
    public static void main(String[] args) {

        ArrayList<String> expected =  new ArrayList<>();

        Collections.addAll(expected, "A", "B", "C", "D");


        ArrayList<String> actual = new ArrayList<>();

        Collections.addAll(actual, "A", "C", "D");


        ArrayList<String>  missing = new ArrayList<>();

        for(String element: expected){
            if(!actual.contains(element)){
                missing.add(element);
            }
        }

        for(String missingElement: missing){

            System.out.println("Missing element: " + missingElement);
        }



    }
}
