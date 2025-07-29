package practice28;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int num = sc.nextInt();

        int begin = 1;
        int count =0;

        if(num<=1){
            System.out.println("Not a prime number");
        } else {

            while(begin<=num){

                if(num%begin==0){
                    count ++;

                }
                begin++;
            }
        }

        if(count>2){
            System.out.println("Not a prime");
        } else {
            System.out.println("yes a prime");

        }
    }
}
