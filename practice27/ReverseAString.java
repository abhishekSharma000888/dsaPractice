package practice27;

public class ReverseAString {

    public static void main(String[] args) {

        String input = "Hello World";

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        System.out.println(sb.toString());
    }


}
