package practice37;

    public class SeparateCharacters {
        public static void separateCharacters(String input) {
            if (input == null || input.isEmpty()) {
                System.out.println("Input is empty.");
                return;
            }

            StringBuilder upperCase = new StringBuilder();
            StringBuilder lowerCase = new StringBuilder();

            for (char ch : input.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    upperCase.append(ch);
                } else if (Character.isLowerCase(ch)) {
                    lowerCase.append(ch);
                }
            }

            System.out.println("Uppercase characters: " + upperCase);
            System.out.println("Lowercase characters: " + lowerCase);
        }

        public static void main(String[] args) {
            String input = "AbHiShEkJava";

            separateCharacters(input);
    }
}
