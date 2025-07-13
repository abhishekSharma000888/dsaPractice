package practice17;

public class FactorialExample {

    public static void main(String[] args) {

        int num = 4;

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        System.out.println("The factorial is: " + fact);
    }
}
