package practice5;

public class PrintEvenIndexedCharacters {

    public static void main(String[] args) {

        String input = "toprintevenindexed characters";

        input = input.toLowerCase();

       char[] arr = input.toCharArray();

       for(int i=0; i<arr.length; i++){

           if(arr[i] !=' ' && i%2==0){

               System.out.println(arr[i]);
           }
       }
    }
}
