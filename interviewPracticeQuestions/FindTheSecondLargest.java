package interviewPracticeQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheSecondLargest {

    public static void main(String[] args){

        int[] arr = {2, 8, 9, 9, 1, 0};

        //First we will create a sorted list with distinct values only

        List<Integer> sorted = Arrays.stream(arr)
                .boxed() // convert int to Integer
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int largest = sorted.get(0); // get the first element from the list that contains distinct elements

        // first we will check that the size of the list is greater than 1, if yes than we get the second element
        // else we get the last element
        int SecondLargest = sorted.size()>1?sorted.get(1) : Integer.MIN_VALUE;

        int ThirdLargest = sorted.size()>2 ? sorted.get(2) : Integer.MIN_VALUE;

        int SmallestNumber = Arrays.stream(arr).min().orElse(Integer.MIN_VALUE);

        System.out.println("Largest:" + largest);
        System.out.println("Second Largest:" + SecondLargest);
        System.out.println("Third Largest:" + ThirdLargest);

    }
}
