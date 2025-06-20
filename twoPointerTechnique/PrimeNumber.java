package twoPointerTechnique;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

    public static void main(String[] args){

        int[] arr = {2,3,29,35,20,27,7};

        List<Integer> l1 = Arrays.stream(arr)
                .boxed()
                .filter(n -> !(n==2 || n==3 || n==5|| n%2==0 || n%3==0 || n%5==0))
                .collect(Collectors.toList());

        l1.toArray();

        for(int num: l1){

            System.out.println(num);
        }
    }
}
