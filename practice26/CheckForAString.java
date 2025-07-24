package practice26;

public class CheckForAString {
    public static void main(String[] args) {

        String input= "Selenium testing is fun and challenging.";
        String check= "testing";

        String[] words = input.split(" ");

        for(int i=0; i<words.length;i++)

            if(words[i].equals(check)){

                System.out.println("The check string is found at the index: "+ i);
            }
    }
}
