package practice10;

public class FactorialOfANumber {

    public static void main(String[] args) {

        int a = 5;

        int product = 1;

        for(int i= a ; i> 1; i--){

            product = product *i;
        }

        System.out.println("The factorial is: "+ product);
    }
}
