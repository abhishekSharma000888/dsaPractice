package practice10;

public class ProgramToReverseANumber {

    public static void main(String[] args) {

        int n = 121345;

        String sb = Integer.toString(n);

        StringBuilder k = new StringBuilder(sb);

        k.reverse();

        System.out.println(k);
    }
}
