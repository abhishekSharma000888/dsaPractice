package practice3;

public class TypeCastingExample {
    public static void main(String[] args) {


        // typecasting is classified into implicit and explicit type casting.
        // in implicit type casting the object is converted from smller to larger type,
        //whereas in explicit type casting, it is converted from larger data type to smaller data type.


        //implicit
        int a = 10;

        double b = a; // no data loss


        double c = 100;

        int k = (int) c; // possible data loss

        // in selenium we use type casting when dealing with web elements.
    }
}