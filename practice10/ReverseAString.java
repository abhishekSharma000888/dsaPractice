package practice10;

public class ReverseAString {

    public static void main(String[] args) {

        String input = "This is a string";

        StringBuilder sb = new StringBuilder(input).reverse();

        System.out.println(sb);

    }
}
