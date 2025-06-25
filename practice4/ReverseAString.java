package practice4;

public class ReverseAString {

    public static void main(String[] args) {

        String input = "Reverse me!";

        StringBuilder sb = new StringBuilder(input);

        String reverse = sb.reverse().toString();

        System.out.println(reverse);
    }
}
