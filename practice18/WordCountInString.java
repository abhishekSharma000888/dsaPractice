package practice18;

public class WordCountInString {

    public static void main(String[] args) {

        String input= "Count words in the string";
        String[] words = input.split(" ");

        int count = 0;

        for(String word: words){

            count ++;
        }

        System.out.println("Word count is: "+ count);

    }
}
