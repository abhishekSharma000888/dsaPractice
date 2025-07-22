package practice20;

public class ReverseStringEachWord {
    public static void main(String[] args) {

        String input= "I love Java";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();




        for(String word: words){

            StringBuilder sb = new StringBuilder(word).reverse();
            result.append(sb);
            result.append(" ");

        }

        System.out.println(result);

    }
}
