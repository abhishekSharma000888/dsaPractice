package practice12;

public class ProductExample {

    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] result = new int[n];


        result[0] = 1;

        for(int i=1; i<n; i++){

            result[i] = result[i-1]* nums[i-1];
        }

        int suffixproduct = 1;

        for(int i=n-1; i>=0; i--){

            result[i] = result[i]*suffixproduct;
            suffixproduct *= nums[i];
        }
        for(int num: result){

            System.out.print(num+" ");
        }
    }
}