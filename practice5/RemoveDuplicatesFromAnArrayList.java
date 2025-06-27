package practice5;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromAnArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList,10, 20, 30, 20, 40, 50, 10, 60, 70, 50, 80, 90, 30, 100, 60);


        List<Integer> s1 = numbersList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(s1);


    }
}
