package practice27;

public class PrintCharacterTwice {

        public static void main(String[] args) {

            String input = "hello";
            StringBuilder sb = new StringBuilder();

            for(char ch: input.toCharArray()){
                sb.append(ch);
                sb.append(ch);
            }

            System.out.println(sb.toString());
        }
    }

