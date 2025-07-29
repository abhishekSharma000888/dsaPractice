package practice26;

public class AppendZerosToEnd {

    public static void main(String[] args) {

        String input = "32400121200";
        StringBuilder sb = new StringBuilder();
        StringBuilder nonZero = new StringBuilder();

        for (char ch : input.toCharArray()) {

            if (ch != '0') {

                sb.append(ch);
            } else {

                nonZero.append(ch);
            }
        }

        sb.append(nonZero);

        System.out.println(sb.toString());
    }
}
