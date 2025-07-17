package practice19;

public class ReverseEachWordOfTheString {
    public static void main(String[] args) {

        String input = "Selenium automation with Java";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word: words){

            StringBuilder rev = new StringBuilder(word).reverse();
            result.append(rev);
            result.append(" ");
        }

        System.out.println( new String(result));

    }
}
