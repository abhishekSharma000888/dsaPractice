package practice14;

public class RotationString {

    public static void main(String[] args) {

        String a = "ABCD";
        String b = "CDAB";

        String temp = a + b;

        if(temp.contains(b)){
            System.out.println("Two strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other!");
        }



    }
}
