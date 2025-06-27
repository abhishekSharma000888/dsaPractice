package practice7;

public class SumOnlyNumbers {

    public static void main(String[] args) {

        char[] arr = {'1', 'a', '3', 'b', '5', '#', '7', '!', '9'};

        int sum=0;

        for(int i=0; i<arr.length; i++){

            if(Character.isDigit(arr[i])){

                sum = sum + Character.getNumericValue(arr[i]);
            }
        }

        System.out.println("The sum is:" + sum);
    }
}
