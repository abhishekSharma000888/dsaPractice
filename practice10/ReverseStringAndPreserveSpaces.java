package practice10;

public class ReverseStringAndPreserveSpaces {

    public static void main(String[] args) {

        String input = "I Am Not String";

        char[] inputArr = input.toCharArray();
        char[] resultArr = new char[inputArr.length];

        for(int i=0; i<inputArr.length; i++){
            if(inputArr[i] ==' '){

                resultArr[i] = ' ';
            }
        }

        int j = inputArr.length-1;
        for(int i=0; i<inputArr.length; i++){

            if(inputArr[i] != ' '){
                while(resultArr[j] == ' '){
                    j--;
                }
                resultArr[j] = inputArr[i];
                j--;
            }
        }
        System.out.println("The final reversed string is: " + String.valueOf(resultArr));

    }
}
