package practice16;

public class ReverseWhilePreservingInputSpaces {

    public static void main(String[] args) {
        String input = "I Am Not String";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Step 1: Mark space positions in result array
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Step 2: Traverse input from end, fill result from start (skipping spaces)
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (result[i] != ' ') {
                // Move j to the next non-space character from the end
                while (inputArr[j] == ' ') {
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }
        }

        System.out.println("Output: " + new String(result));
    }
}