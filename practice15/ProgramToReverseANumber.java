package practice15;

public class ProgramToReverseANumber {

    public static void main(String[] args) {

        int num = 123456;

        StringBuilder sb = new StringBuilder();

        sb.append(num);

        sb.reverse();

        System.out.println("The reversed number is: "+ sb);
    }
}
