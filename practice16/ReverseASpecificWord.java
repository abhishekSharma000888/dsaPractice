package practice16;

public class ReverseASpecificWord {

    public static void main(String[] args) {

        String input = "I Love Java Programming";
        String target = "Programming";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word: words){

            if(word.equals(target)){

                StringBuilder temp = new StringBuilder(word).reverse();
                result.append(temp);
                result.append(" ");
            } else {

                result.append(word);
                result.append(" ");
            }
        }
        System.out.println(result);

    }
}
