package practice16;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Java is powerful";

        String[] words = input.split(" ");
        StringBuilder finalString = new StringBuilder();

        for (String word : words) {
            StringBuilder temp = new StringBuilder();

            temp.append(word).reverse();
            finalString.append(temp);
            finalString.append(" ");
        }

        System.out.println(finalString);
    }
}