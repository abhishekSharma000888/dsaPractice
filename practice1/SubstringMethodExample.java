package practice1;

public class SubstringMethodExample {

    public static void main(String[] args){

        String input = "Ravi Teja Bompally";

        String[] words = input.split(" ");

        System.out.println(words[0].charAt(0)+ "."+ words[1].charAt(0) + "." + words[2]);

    }
}
