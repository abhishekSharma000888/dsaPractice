package practice16;

public class PrintSumOfEvenNumbers {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5};

        int sum =0;

        for(int number: arr1){

            if(number%2 ==0){

                sum += number;
            }
        }

        System.out.println(sum);
    }
}
