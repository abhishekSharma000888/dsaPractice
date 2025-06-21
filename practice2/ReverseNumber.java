package practice2;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 12345;

        String rev = Integer.toString(num);

        StringBuilder sb = new StringBuilder(rev);
        rev = sb.reverse().toString();

        System.out.println(rev);
    }
}
