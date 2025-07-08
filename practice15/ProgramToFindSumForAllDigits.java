package practice15;

public class ProgramToFindSumForAllDigits {

    public static void main(String[] args) {
        int num = 13579;
        StringBuilder sb = new StringBuilder();

        sb.append(num);

        int sum=0;

        for(char ch: sb.toString().toCharArray()){

            if(Character.isDigit(ch)){

                sum += ch -'0';
            }
        }

        System.out.println("The sum is: "+ sum);
    }
}
