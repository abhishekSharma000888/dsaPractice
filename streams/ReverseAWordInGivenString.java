package streams;

public class ReverseAWordInGivenString {
    public static void main(String[] args) {

        String input = "I Love Java Programming";
        // "I Love Java gnimmargorP"

        StringBuilder sb = new StringBuilder();

        String reverse = sb.append("Programming").reverse().toString();

        System.out.println(input.substring(0, 12) + reverse);

    }
}
