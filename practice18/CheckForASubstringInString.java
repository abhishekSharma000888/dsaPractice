package practice18;

public class CheckForASubstringInString {
    public static void main(String[] args) {

        String input= "automation testing with selenium";
        String target = "testing";
        String[] words = input.split(" ");
        Boolean found = false;
        for(String word: words){

            if(word.equals(target)){
                found = true;
            }
        }

        if(found == true){
            System.out.println("The substring was found!");
        } else {
            System.out.println("The substring was not found!");
        }
    }
}
