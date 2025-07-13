package practice17;

public class ReverseStringWhilePreservingOrder {

    public static void main(String[] args) {

        String input = "This is the string!";

        String[] words = input.split(" ");
        StringBuilder finalString = new StringBuilder();

        for(String word : words){

            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            finalString.append(temp);
            finalString.append(" ");
        }


        System.out.println(finalString.toString().trim());


    }
}
