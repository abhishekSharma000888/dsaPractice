package practice5;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args) {

        String input = "32400121200";

        StringBuilder sb = new StringBuilder();

        StringBuilder finalOutput = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(ch !='0'){

                sb.append(ch);
            }
        }

        finalOutput = finalOutput.append(sb);

        for(char ch: input.toCharArray()){

            if(ch =='0'){

                finalOutput.append(ch);
            }
        }

        String finalString = finalOutput.toString();

       System.out.println(finalString);

    }
}
