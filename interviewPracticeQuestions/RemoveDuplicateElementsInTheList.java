package interviewPracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsInTheList {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        List<Integer> sorted = Arrays.stream(arr)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        for(int num: sorted){

            System.out.println(num);
        }

        System.out.println("The end array with unique elements is: ");

    }
}
