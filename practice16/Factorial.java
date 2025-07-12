package practice16;

public class Factorial {

    public static void main(String[] args) {


        int num = 5;
        int fact = 1;

        if (num < 0) {
            System.out.println("Number must be a positive value!");
        } else {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("The factorial is: " + fact);
        }
    }
}
