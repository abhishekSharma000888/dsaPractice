package practice18;

public class LowercaseVsUppercaseCount {
    public static void main(String[] args) {
        String input = "How many Characters upperCase, How many lowerCase";

        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for (char ch : input.toCharArray()) {

            if (ch != ' ') {
                if (Character.isLowerCase(ch)) {
                    lowerCaseCount++;
                } else if (Character.isUpperCase(ch)) {
                    upperCaseCount++;
                }
            }
        }

        System.out.println("The lowercase character count is: " + lowerCaseCount);
        System.out.println("The lowercase character count is: " + upperCaseCount);
    }
}
