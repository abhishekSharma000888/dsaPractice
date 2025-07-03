package practice11;

public class BreakAString {

    public static void main(String[] args) {

        String input = "Subbu123raj";

        StringBuilder sb = new StringBuilder();

        StringBuilder number = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(!Character.isDigit(ch)){

                sb.append(ch);
            } else{
                number.append(ch);
            }
        }

        System.out.println(sb);
        System.out.println(number);
    }
}
