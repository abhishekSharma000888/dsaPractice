package practice3;

public class ReverseANumber {

    public static void main(String[] args) {

        int n = 123456;

        String k = Integer.toString(n);

        StringBuilder sb = new StringBuilder(k).reverse();
        sb.toString();

        System.out.println(sb);
    }
}
