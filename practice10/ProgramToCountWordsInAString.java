package practice10;

public class ProgramToCountWordsInAString {

    public static void main(String[] args) {

        String input = "Hello I am learning Java";

        // Trim the input to remove leading and trailing spaces
        input = input.trim();

        if (input.length() == 0) {
            System.out.println("Invalid string!");
        } else {
            int wordCount = 1;

            for (char ch : input.toCharArray()) {
                if (ch == ' ') {
                    wordCount++;
                }
            }

            System.out.println("The word count is: " + wordCount);
        }
    }
}
