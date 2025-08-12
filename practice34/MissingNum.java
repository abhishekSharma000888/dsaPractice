package practice34;

public class MissingNum {

    public static void main(String[] args) {

        int[] arr = {101, 102, 103, 105, 106, 107};

        int sum = 0;

        for(int num: arr){

            sum += num;
        }

        int missingElement = sum/(arr.length);

        System.out.println("The missing element is: "+ missingElement);
    }
}
