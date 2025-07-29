package practice26;

public class StringRotation {
    public static void main(String[] args) {

        String s1 = "ABCDE";
        String s2 = "DEABCK";

        //to check if the two strings are in rotation

        if(s1.length() == s2.length()){

            if((s1+s1).contains(s2)){

                System.out.println("Two strings are in rotation");
            }   else {
                System.out.println("Two strings are not in rotation");
            }
        } else {
            System.out.println("Two strings are not in rotation");

        }
    }
}
