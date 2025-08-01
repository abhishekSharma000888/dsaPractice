package practice30;

public class ReverseAStringWhileKeepingInputSpacesIntact {
    public static void main(String[] args) {

        //reverse a string by keeping the input order same

        String input = "This is the string";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        //insert from last to first

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
    }
}
