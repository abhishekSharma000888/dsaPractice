package practice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OddOrEvenInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till which you want to find even or odd numbers!");

        int n = sc.nextInt();

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        if(n<=0){

            System.out.println("Not a valid input!");
        } else {

            for(int i=1; i<=n; i++){

                if(i%2 == 0){

                    evenNumbers.add(i);

                } else {

                    oddNumbers.add(i);
                }
            }
        }

        System.out.print("Odd Numbers are: "+ oddNumbers);

        System.out.println(" ");
        System.out.print("Even Numbers are: "+ evenNumbers);



    }
}
