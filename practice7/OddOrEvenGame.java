package practice7;

public class OddOrEvenGame {

    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 88, 23, 90, 33, 56, 79, 102, 111, 150, 173, 200, 201};

        int OddCount = 0;

        int EvenCount = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]%2==0){

                EvenCount ++;
            } else{

                OddCount ++;
            }
        }

        System.out.println("Odd count: "+ OddCount);
        System.out.println("Even count: "+ EvenCount);
    }
}
