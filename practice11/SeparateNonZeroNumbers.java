package practice11;

public class SeparateNonZeroNumbers {

    public static void main(String[] args) {

        String input = "32400121200";

        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(Character.isDigit(ch) && ch == '0'){

                sb.append(ch);
            }
        }

        for(char ch: input.toCharArray()){

            if( ch != '0'){

                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
