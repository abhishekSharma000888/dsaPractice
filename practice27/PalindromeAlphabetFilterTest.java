package practice27;

public class PalindromeAlphabetFilterTest {

    public static void main(String[] args) {
        // ✅ Positive scenario: contains letters and is a palindrome
        runTest("Madam123");

        // ✅ Negative scenario: contains letters and is not a palindrome
        runTest("Test123");

        // ✅ Invalid: only special characters
        runTest("@#$%^&*");

        // ✅ Invalid: only numbers
        runTest("123456");

        // ✅ Edge case: empty string
        runTest("");
    }

    public static void runTest(String input) {
        System.out.println("\n=== Testing input: \"" + input + "\" ===");

        try {
            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException("Input string is empty");
            }

            StringBuilder lettersOnly = new StringBuilder();

            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) {
                    lettersOnly.append(ch);
                }
            }

            if (lettersOnly.length() == 0) {
                throw new Exception("Input string does not contain alphabets.");
            }

            String original = lettersOnly.toString().toLowerCase();
            String reversed = new StringBuilder(original).reverse().toString();

            if (original.equals(reversed)) {
                System.out.println("✅ Extracted alphabet string \"" + lettersOnly + "\" is a palindrome.");
            } else {
                System.out.println("❌ Extracted alphabet string \"" + lettersOnly + "\" is NOT a palindrome.");
            }

        } catch (Exception e) {
            System.out.println("⚠️  " + e.getMessage());
        }
    }
}
