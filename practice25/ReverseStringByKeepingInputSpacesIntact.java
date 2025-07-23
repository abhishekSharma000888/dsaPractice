package practice25;

public class ReverseStringByKeepingInputSpacesIntact {

    public static void main(String[] args) {

        String input = "This is the string";
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