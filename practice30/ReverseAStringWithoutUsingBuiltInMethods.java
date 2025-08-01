package practice30;

public class ReverseAStringWithoutUsingBuiltInMethods {

    public static void main(String[] args) {

        String input = "hello";
        char[] inputArr = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int j = inputArr.length - 1; j < inputArr.length; j--) {

            if (j < 0) {
                break;
            } else {
                sb.append(inputArr[j]);
            }
        }

        System.out.println(sb.toString());
    }
}
