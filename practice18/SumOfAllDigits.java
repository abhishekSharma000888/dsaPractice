package practice18;

public class SumOfAllDigits {
    public static void main(String[] args) {

        int num = 12345678;
        String numLength = String.valueOf(num);
        int sum = 0;

        for(char ch: numLength.toCharArray()){

            if(Character.isDigit(ch))

                sum += Character.getNumericValue(ch);
        }

        System.out.println("Sum is: "+ sum);

    }
}
