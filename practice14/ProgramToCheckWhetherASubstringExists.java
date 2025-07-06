package practice14;

public class ProgramToCheckWhetherASubstringExists {

    public static void main(String[] args) {
        String mainString = "Hello, welcome to Java programming.";
        String subString = "Java";

        boolean wordFound = false;
        int index;

        String[] words = mainString.split(" ");

        if (mainString.length() == 0) {

            System.out.println("The main string is empty!");
        }

        for (String word : words) {

            if (word.contains("Java")) {

                wordFound = true;
                break;
            } else {

                wordFound = false;
            }
        }

        if(wordFound == true){

            System.out.println("The substring was found correctly!");
        } else {

            System.out.println("The substring was not found!");
        }
    }
}
