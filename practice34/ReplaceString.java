package practice34;

public class ReplaceString {

    public static void main(String[] args) {
        String input = "GoodMorningGoodAfternoonGoodNight";

        // Use lastIndexOf to find the last occurrence
        int idx = input.lastIndexOf("Good");

        // If found, build the result directly
        String result = (idx == -1) ? input
                : new StringBuilder(input)
                .replace(idx, idx + 4, "Bad")
                .toString();

        System.out.println(result);

    }
}
