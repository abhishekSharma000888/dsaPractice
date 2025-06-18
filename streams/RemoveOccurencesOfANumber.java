package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveOccurencesOfANumber {

    public static void main(String[] args){

        int[] arr = {2,2,3,4,2,6,8};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to be removed: ");

        int n = scanner.nextInt();



        List<Integer> l1 = Arrays.stream(arr)
                .boxed()
                .filter(k -> k !=2)
                .collect(Collectors.toList());

            System.out.println("Array after removal: " + l1);
        }
    }

