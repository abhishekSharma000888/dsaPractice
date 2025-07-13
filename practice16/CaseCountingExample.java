package practice16;

public class CaseCountingExample {

    public static void main(String[] args) {

        String input = "Count lowerCase and UpeerCase Characters";

        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for(char ch: input.toCharArray()){

            if(ch !=' '){

                if(Character.isUpperCase(ch)){
                    upperCaseCount ++;
                } else{
                    lowerCaseCount++;
                }
            }
        }
        System.out.println("Uppercase count is: "+ upperCaseCount);
        System.out.println("Lowercase count is: "+ lowerCaseCount);
    }

}
