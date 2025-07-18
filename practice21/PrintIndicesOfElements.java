package practice21;

import java.util.ArrayList;

public class PrintIndicesOfElements {
    public static void main(String[] args) {

        int[] arr={1,1,4,5,7,4,6,1};

        ArrayList<Integer> a1 = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                    System.out.println
                            ("The element "+ arr[i] + " occured at " + i +
                                    "and "+ j);
                }
            }
        }

    }
}
