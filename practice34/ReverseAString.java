package practice34;

public class ReverseAString {

    public static void main(String[] args) {

        String input = "reverse this, keep spaces intact.";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        for(int i=0; i<inputArr.length; i++){

            if(inputArr[i] == ' '){
                result[i] = ' ';
            }
        }

        int j = inputArr.length -1;
        for(int i=0; i<inputArr.length; i++){

            if(result[i] != ' '){
                while(inputArr[j] == ' '){
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }

        }
        System.out.println(new String(result));
    }

}
