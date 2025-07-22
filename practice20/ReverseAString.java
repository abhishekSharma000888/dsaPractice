package practice20;

public class ReverseAString {

    public static void main(String[] args) {

        String input = "I love Java";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        //first we will store the spaces

        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }
        //then we will iterate through end to first

        int j = inputArr.length - 1;
        for (int i = 0; i < inputArr.length; i++) {
            if (result[i] != ' ') {

                result[i] = inputArr[j];
                j--;
            }
        }

        System.out.println(new String(result));
    }
}