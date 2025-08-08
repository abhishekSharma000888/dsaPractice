package practice33;

public class PrimeCheck {
    public static void main(String[] args) {

        int num = 6;

        int count =0;

        if(num <=1){
            System.out.println("The number is not prime!");
        } else {
            int start =1;
            while(start<=num){
                if(num%start ==0){
                    count ++;
                }
                start++;
            }
        }

        if(count !=2){
            System.out.println("The number is not prime!");
        } else {
            System.out.println("The number is prime!");
        }
    }
}
