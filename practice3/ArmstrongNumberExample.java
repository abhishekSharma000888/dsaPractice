package practice3;

public class ArmstrongNumberExample {

    public static void main(String[] args) {

        int number = 153; // You can change this to test other numbers
        int originalNumber = number;
        int result = 0;

        // Step 1: Find the number of digits
        int numberOfDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, numberOfDigits);
            number = number / 10;
        }

        // Step 2: Check if Armstrong
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }
}
