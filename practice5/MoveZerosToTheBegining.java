package practice5;

public class MoveZerosToTheBegining {

    public static void main(String[] args) {

        String input = "32400121200";

        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(ch =='0'){

                sb.append(ch);
            }
        }

        for(char ch: input.toCharArray()){

            if(ch !='0'){
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
