package practice9;

public class SeparateStrings {

    public static void main(String[] args) {

        String input = "abcd1234@#%";

        StringBuilder alphabets = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder scpecialCharacters = new StringBuilder();


        for(char ch: input.toCharArray()){

            if(!Character.isLetterOrDigit(ch)){

                scpecialCharacters.append(ch);
            } else if (Character.isDigit(ch)) {

                digits.append(ch);

            } else {

                alphabets.append(ch);
            }
        }

        System.out.println("Alphabets: " + alphabets);
        System.out.println("Special Characters: " + scpecialCharacters);
        System.out.println("Digits: "+ digits);
    }
}
