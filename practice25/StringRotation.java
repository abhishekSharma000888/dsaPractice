package practice25;

public class StringRotation {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "deabc";

        if(((s1.length()  == s2.length()) && ((s1+s1).contains(s2)))) {

            System.out.println("The two strings are in rotation.");
        } else {
            System.out.println("The two strings are not in rotation.");
        }
    }
}
