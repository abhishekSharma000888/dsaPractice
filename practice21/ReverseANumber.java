package practice21;

public class ReverseANumber {

    public static void main(String[] args) {

        int a = 122312;

        StringBuilder b = new StringBuilder(Integer.toString(a)).reverse();

        System.out.println(b);
    }
}
