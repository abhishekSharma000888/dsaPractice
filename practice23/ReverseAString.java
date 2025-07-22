package practice23;

public class ReverseAString {
    public static void main(String[] args) {

        String input = "Reverse me by keeping the spaces intact";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // first iterate over the array and save the spaces.

        for(int i=0; i<inputArr.length; i++){

            if(inputArr[i] == ' '){
                result[i] = ' ';
            }
        }

        // start from end and input all the characters to the result

        int j = inputArr.length -1;

        for(int i=0; i<inputArr.length; i++){

            if(result[i]!= ' '){

                while(inputArr[j]==' '){
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }

        }

        System.out.println(new String(result));

    }
}
