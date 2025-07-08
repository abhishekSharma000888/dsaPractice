package practice16;

public class EvenIndexCharacters {
    public static void main(String[] args) {
        String input = "Programming";

        System.out.println("Characters at even indices:");
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(input.charAt(i));
            }
        }
    }
}
