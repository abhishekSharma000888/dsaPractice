package practice5;

public class ToPrintEachLetterTwice {

    public static void main(String[] args) {

        String input = "hello";

        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()){

            sb.append(ch).append(ch);
        }

       // sb.toString();

        System.out.println(sb);

    }
}
