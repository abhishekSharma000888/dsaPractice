package practice15;

public class ProgramToCountDigits {

    public static void main(String[] args) {
        int num = 13579;
        int count = 0;

        StringBuilder sb = new StringBuilder();
        sb.append(num);


        for(char ch: sb.toString().toCharArray()){
            if(Character.isDigit(ch)){

                count ++;
            }
        }

        System.out.println(count);
    }
}
