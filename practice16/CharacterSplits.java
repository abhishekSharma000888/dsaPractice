package practice16;

public class CharacterSplits {
    public static void main(String[] args) {

        String input = "abcd1234@#%";

        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(!(Character.isDigit(ch) || Character.isLetter(ch))){

                specialCharacters.append(ch);
            } else if (Character.isDigit(ch)){

                digits.append(ch);
            } else {
                letter.append(ch);
            }
        }

        System.out.println("Letters are:"+ letter);
        System.out.println("digits are:"+ digits);
        System.out.println("special Characters are:"+ specialCharacters);
    }
}
