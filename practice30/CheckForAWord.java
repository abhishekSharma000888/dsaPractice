package practice30;

public class CheckForAWord {

    public static void main(String[] args) {

        String input = "Automation is powerful";
        String target = "power";
        String[] words = input.split(" ");

        boolean doesContain = false;

        for (String word : words) {
            if (word.contains(target)) {
                doesContain = true;
            }

        }

        if (doesContain == true) {

            System.out.println("The word " + target + " is present in the string.");
        } else {
            System.out.println("The word is not present!");
        }


    }
}
