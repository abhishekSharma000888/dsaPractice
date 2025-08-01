package practice29;

public class ReverseStringWhileKeepingInputSpacesIntact {

    /*
    in order to reverse string while keeping the input spaces intact.
    First: iterate over the string and add all spaces to the result string.
    Second: take a variable j, assign to last index of input array, check we are not copying the spaces, and add element to
    the result array.
     */
    public static void main(String[] args) {

        String input = "Reverse this by keeping input spaces intact.";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        //first iterate and find spaces, add it to the result array
        for(int i=0; i<inputArr.length; i++){
            if(inputArr[i] == ' '){
                result[i]= ' ';
            }
        }

        //now iterate from last to first and add elements to result array

        int j= inputArr.length-1;

        for(int i=0;i<inputArr.length;i++){
            if(result[i] !=' '){
                while(inputArr[j] == ' '){
                    j--;
                }
                result[i]=inputArr[j];
                j--;
            }

        }

        System.out.println(new String(result));
    }
}
