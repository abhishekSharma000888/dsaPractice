package practice24;

public class ReverseStringByKeepingTheInputSpacesIntact {
    public static void main(String[] args) {

        String input = "reverse me, but keep spaces intact";
        char[] inputArr = input.toCharArray();
        char[] result = new char[inputArr.length];

        // first keep the spaces

        for(int i=0; i<inputArr.length; i++){

            if(inputArr[i] == ' '){

                result[i]= ' ';
            }
        }

        //travel from last to first and add characters

        int j= inputArr.length-1;

        for (int i = 0; i < inputArr.length; i++) {
            if (result[i] != ' ') {
                while (inputArr[j] == ' ') {
                    j--;
                }
                result[i] = inputArr[j];
                j--;
            }
        }

        System.out.println(new String(result));

    }
}
