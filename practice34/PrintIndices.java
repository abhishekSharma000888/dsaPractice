package practice34;

import java.util.Scanner;

public class PrintIndices {

    public static void main(String[] args) {

        int[] arr = {1,3,3,4,5,6,6,7,8,9,9};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find it's indices: ");

        int num = sc.nextInt();
        int count =0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] == num){

                System.out.println("The number: "+ num + "occured at "+ "index "+ i);
                count ++;
            }
        }

        if(count ==0){
            System.out.println("The element was not found");
        }
    }
}

