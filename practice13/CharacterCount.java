package practice13;

public class CharacterCount {
    public static void main(String[] args) {

        String input = "This is the string and reverse last Word";

        int lowercaseCount=0;
        int uppercaseCount=0;

        for(char ch: input.toCharArray()){

            if(ch != ' '){
                if(Character.isUpperCase(ch)){

                    uppercaseCount ++;
                } else {
                    lowercaseCount ++;
                }
            }
        }

        System.out.println("uppercase count is:"+ uppercaseCount);
        System.out.println("lowercase count is:"+ lowercaseCount);

    }
}
