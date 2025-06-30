package practice10;

public class ToReverseEachWordOfAString {

    public static void main(String[] args) {

        String input = "Reverse this string";

        String[] words = input.split(" ");

        StringBuilder sb = new StringBuilder();

        for(String word: words){

            StringBuilder temp = new StringBuilder(word).reverse().append(" ");
            sb.append(temp);
        }

        System.out.println(sb);
    }
}
