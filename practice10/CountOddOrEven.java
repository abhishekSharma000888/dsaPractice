package practice10;

public class CountOddOrEven {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int oddCount =0;

        int evenCount =0;

        for(int i=0; i<arr.length; i++){

            if(arr[i]%2==0){

                evenCount = evenCount+1;
            } else {

                oddCount = oddCount+1;
            }
        }

        System.out.println("The oddcount is: "+ oddCount);
        System.out.println("The evenCount is: "+ evenCount);
    }
}
