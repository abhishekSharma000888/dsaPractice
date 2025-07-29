package practice27;

public class ReverseString {
    public static void main(String[] args) {

        String input = "I am a string";

//reverse while preserving the order for spaces

        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

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
        System.out.println(new String(result));
    }
}
