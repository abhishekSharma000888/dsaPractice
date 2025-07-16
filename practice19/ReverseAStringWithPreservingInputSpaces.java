package practice19;

public class ReverseAStringWithPreservingInputSpaces {

    public static void main(String[] args) {

        String input = "Selenium is the automation with Java";

        char[] inputArr = input.toCharArray();

        char[] result = new char[inputArr.length];

        //first we will add all the spaces in the input array
        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i] == ' ') {
                result[i] = ' ';
            }
        }

        //now we will add from last to first character

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
