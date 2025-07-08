package practice14;

public class FindOccurencesOfASubstring {

    public static void main(String[] args) {

        String input = "Java is popular. Java is powerful. Java is easy to learn.";

        int count=0;

        String[] words = input.split(" ");

        for(String word: words){

            if(word.contains("Java")){

                count ++;
            }
        }

        if(count ==0){

            System.out.println("Word was not found in the string.");
        } else {

            System.out.println("The count is: "+ count );
        }
    }
}
