package practice32;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to be checked: ");

        int num = sc.nextInt();

        int count = 0;

        int j=1;

        if(num <1 || num ==1){
            System.out.println("The number is not prime!");
            return;

        } else {

            while(j<=num){

                if(num%j ==0){
                    count ++;
                }
                j++;
            }
        }

        if(count !=2){
            System.out.println("The number is not prime!");
        } else {
            System.out.println("The number is prime!");

        }
    }
}

