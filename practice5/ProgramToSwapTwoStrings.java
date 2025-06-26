package practice5;

public class ProgramToSwapTwoStrings {

    public static void main(String[] args) {

        String a = "First String";
        String b = "Second String";

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Step 1: Concatenate both strings
        a = a + b;

        // Step 2: Extract the original 'a' and assign it to 'b'
        b = a.substring(0, a.length() - b.length());

        // Step 3: Extract the original 'b' and assign it to 'a'
        a = a.substring(b.length());

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
