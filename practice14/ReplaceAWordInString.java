package practice14;

public class ReplaceAWordInString {

    public static void main(String[] args) {

        String input = "Java is fun. Java is powerful.";
        String replacedString = input.replaceAll("Java", "Python");

        System.out.println(replacedString);
    }
}
