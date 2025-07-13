package practice17;

public class RemoveSpacesFromString {
    public static void main(String[] args) {

        String input = "remove the spaces from this String";

        StringBuilder sb = new StringBuilder();

        String[] words = input.split(" ");

        for (String word : words) {

            sb.append(word);
        }

        System.out.println(sb.toString());
    }
}
