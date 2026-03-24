package practice35;

public class UpperLowerCaseSplitter {
    public static void main(String[] args) {
        String input = "Hello World 123!";

        System.out.println("Uppercase characters:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(ch + " ");
            }
        }

        System.out.println("\nLowercase characters:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(ch + " ");
            }
        }
    }
}
