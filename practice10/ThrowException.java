package practice10;

public class ThrowException {

    public static void main(String[] args) {

        // throw new ExceptionType(Exception message)
        try {
            int a = 10 / 0;

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Cannot divide it by zero!");
        } finally {
            System.out.println("The jvm continues....");
        }
    }
}
