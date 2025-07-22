package practice20;

public class RotationsCheck {
    public static void main(String[] args) {

        String a = "ABCD";
        String b ="BCDA";

        if(areRotations(a,b)){

            System.out.println("The strings are rotations of each other. ");
        } else {
            System.out.println("The strings are not rotations of each other. ");

        }
    }

    public static boolean areRotations(String s1, String s2){

        return s1.length() == s2.length() && (s1+s1).contains(s2);
    }
}
