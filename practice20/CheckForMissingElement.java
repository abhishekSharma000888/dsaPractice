package practice20;

public class CheckForMissingElement {

    public static void main(String[] args) {

        String input = "This string might contain the missing element";
        String target = "element";

        boolean isFound = false;
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase(target)) {
                isFound = true;
            }
        }

        if (isFound == true) {
            System.out.println("The missing element was found");
        } else {
            System.out.println("The missing element was not found");

        }
    }
        }
