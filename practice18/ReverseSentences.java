package practice18;

public class ReverseSentences {

    public static void main(String[] args) {
        String input = "I Am Not String";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Mark spaces in the result
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Fill characters in reverse, skipping spaces
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != ' ') {
                while (result[j] == ' ') {
                    j--;
                }
                result[j] = inputArr[i];
                j--;
            }
        }

        System.out.println(new String(result));
    }
}
