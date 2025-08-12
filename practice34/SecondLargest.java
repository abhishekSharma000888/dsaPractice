package practice34;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        int largest = 0;
        int secondLargest = 0;

        for(int num: arr){

            if(num> largest){

                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        System.out.println("The secondLargest is: "+ secondLargest);

    }
}
