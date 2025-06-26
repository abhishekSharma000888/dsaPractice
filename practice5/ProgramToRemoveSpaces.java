package practice5;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramToRemoveSpaces {

    public static void main(String[] args) {

        String input = "the string have many spaces!";

       StringBuilder sb = new StringBuilder();

       for(char ch: input.toCharArray()){

           if(ch != ' '){

               sb.append(ch);

           }
       }

       sb.toString();

       System.out.println(sb);



        }
    }

