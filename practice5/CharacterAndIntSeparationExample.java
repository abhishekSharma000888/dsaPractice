package practice5;

public class CharacterAndIntSeparationExample {

    public static void main(String[] args) {

        String input = "Subbu123raj";

        StringBuilder stringHolder = new StringBuilder();
        StringBuilder numericalHolder = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(ch>='0'&& ch<='9'){

                numericalHolder.append(ch);
            } else {

                stringHolder.append(ch);
            }
        }

        System.out.println("Characters: "+ stringHolder);
        System.out.println("Numerical holders: "+ numericalHolder);
    }
}
