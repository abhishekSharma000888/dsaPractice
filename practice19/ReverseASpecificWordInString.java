package practice19;

public class ReverseASpecificWordInString {

    public static void main(String[] args) {
        String input = "I Love Java Programming";

        String target = "Programming";

        StringBuilder result = new StringBuilder(input.length());

        String[] words = input.split(" ");
        for (String word : words) {

            if (word.equals(target)) {

                StringBuilder rev = new StringBuilder(word).reverse();
                result.append(rev);
            } else {
                result.append(word);
                result.append(" ");
            }
        }

        System.out.println(result);
    }
}
