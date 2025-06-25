package practice4;

public class PalindromeORNot {

    public static void main(String[] args) {

        String input = "akka";

        StringBuilder sb = new StringBuilder(input);

        String reveversed = sb.reverse().toString();

        if(reveversed.matches(input)){

            System.out.println("The string is palindrome!");
        } else{

            System.out.println("It is not a palindrome!");
        }
    }
}
