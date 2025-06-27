package practice7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchAnElementInTheArray {
    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50, 65, 70, 85, 90};

        int findElement = 65;


        List<Integer> l1 = Arrays.stream(arr)
                .boxed()
                .distinct()
                .filter(n -> n == findElement)
                .collect(Collectors.toList());

        if(!l1.isEmpty()){
            System.out.println("The element " + findElement + " is found in the array.");
        } else {
            System.out.println("The element " + findElement + " is not found in the array.");
        }
        }
    }

