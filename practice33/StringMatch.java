package practice33;

public class StringMatch {
    public static void main(String[] args) {
        String input ="abc@#%hgyt@#%dkdhjhk@#%kdhkdhhs k@#%dhkjdhfkhfk@#%";

        char[] inputArr = input.toCharArray();
        int count =0;

        for(int i=0; i<inputArr.length; i++){

            if(inputArr[i] == '@' && inputArr[i+1]=='#'&& inputArr[i+2]== '%'){
                count ++;
            }
        }

        System.out.println("The count is: "+ count);
    }
}
