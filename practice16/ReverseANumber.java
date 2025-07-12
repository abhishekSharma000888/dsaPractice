package practice16;

public class ReverseANumber {

    public static void main(String[] args) {

        int num = 3239;

        String convert = Integer.toString(num);

        StringBuilder result = new StringBuilder(convert);

        result.reverse().toString();

        System.out.println("result: "+ result);
    }

}