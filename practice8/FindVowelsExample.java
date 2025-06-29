package practice8;

public class FindVowelsExample {

    public static void main(String[] args) {

        String input = "Your name";

        input = input.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for(char ch: input.toCharArray()){

            if(ch == 'a' || ch== 'e'|| ch=='i' || ch=='o' || ch == 'u'){

                sb.append(ch);
            }
        }

        System.out.println("The vowels in the string are: " + sb);
    }
}
