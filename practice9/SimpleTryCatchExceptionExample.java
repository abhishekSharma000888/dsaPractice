package practice9;

public class SimpleTryCatchExceptionExample {

    public static void main(String[] args) {


        int a = 10;

        try {
            int b = a/0;

        } catch (ArithmeticException e) {

            System.out.println("The exception has been thrown!");

        } finally {
            System.out.println("The code ran successfully!");
        }
    }
}
