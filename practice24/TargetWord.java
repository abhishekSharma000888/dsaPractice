package practice24;

public class TargetWord {
    public static void main(String[] args) {

        String mainString = "Selenium automation testing";
        String target = "automation";

        String[] words = mainString.split(" ");

        for(int i=0; i<words.length; i++){

            if(target.equals(words[i])){

                System.out.println("The word: "+ target +"is found at: "
                        + i);
            }
        }
    }
}
