package practice26;

public class ReverseString {
    public static void main(String[] args) {

        //reverse a string while preserving spaces!

        String input = "reverse this statement";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        for(int i=0;i<inputArr.length;i++){

            if(inputArr[i]==' '){

                result[i]=' ';
            }
        }

        //trverse from right to left

        int j= inputArr.length-1;

        for(int i=0;i<inputArr.length;i++){
            if(result[i] !=' '){

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
