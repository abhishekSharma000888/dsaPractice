package practice16;

public class SpecificString {

    public static void main(String[] args) {
    String input= "Ravi Teja Bompally";
    StringBuilder result = new StringBuilder(input.length());
    String[] words = input.split(" ");

    String target = "Bompally";

      for(String word: words){

        if(!word.equals(target)){
            result.append(word.substring(0,1));
            result.append(".");

        } else {

            result.append(target);
        }
    }
      System.out.println(result);
}
}

