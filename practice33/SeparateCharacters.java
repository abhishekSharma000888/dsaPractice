package practice33;

public class SeparateCharacters {

    public static void main(String[] args) {
        String input = "testString1234@@@";

        StringBuilder specialCharacters = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        StringBuilder digits = new StringBuilder();

        for (char ch : input.toCharArray()) {

            if (Character.isDigit(ch)) {

                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                specialCharacters.append(ch);
            }
        }

        System.out.println("The letters are: " + letters);
        System.out.println("The digits are: " + digits);
        System.out.println("The special characters are: " + specialCharacters);
    }
}
