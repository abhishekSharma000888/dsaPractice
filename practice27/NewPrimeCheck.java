package practice27;

import java.util.Scanner;

public class NewPrimeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to perform prime check: ");

        int num = sc.nextInt();

        int count=0;

        if(num<=1){
            System.out.println("The number is not prime: ");
        }

        for(int i=1; i<=num; i++){
            if(num%i==0){
                count ++;
            }
        }

        if(count <=2){
            System.out.println("The number is prime: ");
        } else {
            System.out.println("The number is not prime: ");

        }
    }
}
