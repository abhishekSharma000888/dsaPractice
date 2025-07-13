package practice17;

public class ReverseStringWhilePreservingSpaces {

    public static void main(String[] args) {
        String input= "I Am Not String";

        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        //first we will add all the spaces to the result array

        for(int i=0; i<inputArr.length; i++){
            if(inputArr[i] == ' '){
                result[i] = ' ';
            }
        }

        //now we will iterate from last to first and add characters

        int j= inputArr.length-1;
        for(int i=0; i<inputArr.length; i++){
            if(result[i] !=' '){

                while(inputArr[j] == ' '){
                    j--;
                }
                result[i] =inputArr[j];
                j--;
            }

        }
        System.out.println(new String(result));
    }

}
