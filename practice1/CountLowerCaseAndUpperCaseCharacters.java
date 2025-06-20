package practice1;

public class CountLowerCaseAndUpperCaseCharacters {

    public static void main(String[] args) {

        String input = "Welcome to the SDET";

        int lowerCase = 0;

        int upperCase = 0;

        for(char ch: input.toCharArray()){

            if(Character.isLowerCase(ch)){

                lowerCase ++;
            } else {
                if(Character.isUpperCase(ch)){

                    upperCase++;
                }
            }
        }

        System.out.println("LowerCase count: "+ lowerCase);
        System.out.println("UpperCase count: "+ upperCase);
    }
}
