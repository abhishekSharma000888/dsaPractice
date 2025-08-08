package practice32;

public class ReverseAStringWhileKeepingSpacesIntact {
    public static void main(String[] args) {
        String input = "Reverse this with spaces intact!";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // Step 1: Mark space positions
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        // Step 2: Reverse characters, skipping spaces
        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (result[i] != ' ') {
                while (inputArr[j] == ' ') {
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }
        }

        // Output result
        System.out.println(new String(result));
    }
}
