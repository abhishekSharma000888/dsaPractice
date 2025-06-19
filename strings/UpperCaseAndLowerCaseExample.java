package strings;

public class UpperCaseAndLowerCaseExample {

    public static void main(String[] args) {
        String input = "Welcome to Code";

        int lowerCount = 0;
        int upperCount = 0;


        for (char ch : input.toCharArray()) {

           if(Character.isLowerCase(ch)){

               lowerCount ++;
           } else if (Character.isUpperCase(ch)){

               upperCount ++;
           }
        }
        System.out.println("Uppercase letters: " + upperCount);
        System.out.println("Lowercase letters: " + lowerCount);
    }
}