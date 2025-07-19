package practice22;

public class ReverseAString {

    public static void main(String[] args) {

        String input = "I Am Not String";
        // Expected Output: g ni rtS toNmAI

        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Step 1: Mark the spaces in the result array
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Step 2: Place characters in reverse, skipping spaces
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (result[i] != ' ') {
                while (j >= 0 && inputArr[j] == ' ') {
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }
        }

        System.out.println(new String(result));
    }
}
