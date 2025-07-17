package practice18;

public class ReverseStringWhilePreservingInputSpaces {
    public static void main(String[] args) {
        String input = "This is the string";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        //first add spaces to result string

        for(int i=0;i<inputArr.length; i++){
            if(inputArr[i] ==' '){
                result[i]= ' ';
            }
        }

        //add elements by traversing from end

        int j= inputArr.length-1;
        for(int i=0; i<inputArr.length; i++){

            if(inputArr[i] !=' '){
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
