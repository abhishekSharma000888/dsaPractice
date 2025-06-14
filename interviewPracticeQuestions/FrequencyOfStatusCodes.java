package interviewPracticeQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfStatusCodes {

    public static void main(String[] args){

        int[] input = {200, 404, 200, 500, 404, 200};

        Map<Integer, Long> freqMap = Arrays.stream(input)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                code -> code,      // it will group together all the similar entries
                                Collectors.counting()));     // it will count the occurences

        System.out.println("Frequency of each status code is: " + freqMap);

    }
}
