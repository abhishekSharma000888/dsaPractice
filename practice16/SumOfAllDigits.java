package practice16;

public class SumOfAllDigits {
    public static void main(String[] args) {

        int num = 3239;
        String numString = Integer.toString(num);

        int sum=0;

        for(char ch: numString.toCharArray()){
            if(ch != '0'){

                sum += Character.getNumericValue(ch);
            }
        }
        System.out.println("sum is: "+ sum);

    }
}
