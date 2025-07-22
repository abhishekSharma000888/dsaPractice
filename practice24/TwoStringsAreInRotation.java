package practice24;

public class TwoStringsAreInRotation {

    public static void main(String[] args) {

        String s1 = "ABCD";
        String s2 = "CDAB";


        if (s1.length() == s2.length()) {

            if ((s1 + s1).contains(s2)) {
                System.out.println("The two strings are in rotation");
            } else {
                System.out.println("The two strings are not in rotation");
            }
        } else {
            System.out.println("The two strings are not in rotation");
        }

    }
}
