package practice3;

public class ToCalculateTheSumOfDigitsInTheNumber {

    public static void main(String[] args) {

        int n = 12345;

        int num = n;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            sum = sum + digit;    // Add it to sum
            num = num / 10;       // Remove the last digit
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
