package practice21;

public class StringVsDigits {
    public static void main(String[] args) {

        String input = "Subbu123raj";
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                a.append(ch);
            } else {

                b.append(ch);
            }
        }

        System.out.println("The digits are: " + a.toString());
        System.out.println("The digits are: " + b.toString());

    }
    }
