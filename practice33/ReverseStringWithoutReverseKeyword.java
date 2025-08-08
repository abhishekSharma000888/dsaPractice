package practice33;

public class ReverseStringWithoutReverseKeyword {

    public static void main(String[] args) {

        String input = "ReverseThis";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];



        for(int i=0; i<inputArr.length; i++){
            result[i] = inputArr[inputArr.length - 1 - i];

        }


        System.out.println(new String(result));

    }
}
