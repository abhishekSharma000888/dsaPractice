package twoPointerTechnique;

public class IsPalindromeExample {

    public static void main(String[] args){

        String s ="madam";

        boolean found = true;

        StringBuilder sb = new StringBuilder();

        String reverse = sb.append(s).reverse().toString();

        if(reverse.matches(s)){

            System.out.println("The given string is palindrome!");


        } else
        {
            System.out.println("The given string is not a palindrome!");
        }

    }
}
