package practice14;

public class ReverseASubstringWithinAString {

    public static void main(String[] args) {

        String input = "The quick brown fox jumps over the lazy dog";

        String subString = "brown";

        StringBuilder finalString = new StringBuilder();

        String[] words = input.split(" ");

        for(String word: words){

            if(word.equals(subString)){

                StringBuilder reverseWord = new StringBuilder(subString).reverse().append(" ");
                finalString.append(reverseWord);
            } else {

                finalString.append(word).append(" ");
            }
        }

        System.out.println(finalString.toString().trim());

    }
}
