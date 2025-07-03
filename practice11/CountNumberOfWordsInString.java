package practice11;

public class CountNumberOfWordsInString {

    public static void main(String[] args) {

        String input = "Learning Java can be fun and rewarding";

        String[] words = input.split(" ");

        int wordCount = 0;

        for(String word: words){

            wordCount++;
        }

        System.out.println(wordCount);
    }
}
