package practice12;

public class CountLowercaseAndUpperCase {

    public static void main(String[] args) {

        String input = "Welcome to The Code";

        int lowercaseCount = 0;
        int uppercaseCount = 0;

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                if(Character.isLowerCase(ch)){

                    lowercaseCount ++;
                } else{

                    uppercaseCount ++;
                }
            }
        }

        System.out.println("lowercaseCount: "+ lowercaseCount);
        System.out.println("uppercaseCount: "+ uppercaseCount);
    }
}
