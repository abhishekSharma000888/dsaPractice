package practice2;

public class SwapNumbersWithoutUsingThird {

    public static void main(String[] args) {

        //Swap without using third variable
        int a = 10;

        int b =17;

       a = a + b; //27
        b = a - b; // 10

        a = a - b;

        System.out.println("a: "+ a);

        System.out.println("b: "+ b);
    }
}
