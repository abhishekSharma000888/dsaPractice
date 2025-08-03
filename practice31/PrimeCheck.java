package practice31;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        // prime check

        Scanner sc = new Scanner(System.in);


        int count =0;

        System.out.println("Enter the number to be checked for prime!");

        int num = sc.nextInt();

        if(num <=1){
            System.out.println("The number is not prime!");
            return;
        } else {

            for(int j=1; j<=num; j++){
                if(num%j==0){
                    count ++;
                }
            }
        }

        if(count !=2){

            System.out.println("The number is not prime!");

        } else {
            System.out.println("The number is prime!");
        }
    }
}
