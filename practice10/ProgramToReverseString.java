package practice10;

public class ProgramToReverseString {

    public static void main(String[] args) {


        String input = "This is the string";

       String finalString = "";

       for(int i=input.length()-1; i>=0; i--){

           finalString = finalString + input.charAt(i);
       }

        System.out.println("The reversed string is: " + finalString);
    }
}