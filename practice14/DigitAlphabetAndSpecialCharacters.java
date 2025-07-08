package practice14;

public class DigitAlphabetAndSpecialCharacters {

    public static void main(String[] args) {

        String input = "abcd1234@#%";
        StringBuilder alphabets = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(!Character.isDigit(ch) && !(Character.isLetter(ch))){
                specialCharacters.append(ch);
            } else if(Character.isDigit(ch)){
                digits.append(ch);
            } else {
                alphabets.append(ch);
            }
        }

        System.out.println("alphabets: " + alphabets);
        System.out.println("digits: " + digits);
        System.out.println("specialCharacters: " + specialCharacters);


    }
}
