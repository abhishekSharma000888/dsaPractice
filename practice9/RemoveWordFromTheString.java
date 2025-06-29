package practice9;

import java.util.Arrays;

public class RemoveWordFromTheString {

    public static void main(String[] args) {

        String input = "Hello World";

        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(ch == ' '){
                break;
            } else{

                sb.append(ch);
            }
        }

        sb.reverse();

        System.out.println(sb);
    }
}
