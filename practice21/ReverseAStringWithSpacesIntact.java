package practice21;

public class ReverseAStringWithSpacesIntact {
    public static void main(String[] args) {
        String input = "I  love  Java";

        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Step 1: Mark spaces in result[]
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Step 2: Fill characters in reverse order, skipping spaces
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (result[i] != ' ') {
                // Skip spaces from the end
                while (j >= 0 && inputArr[j] == ' ') {
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }
        }

        // Print the final output
        System.out.println(new String(result));
    }
}
