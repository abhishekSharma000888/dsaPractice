package practice25;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10;
        int b=20;

        b= a + b - b; // 10
        a = a + b; //20

        System.out.println("a is: "+ a);
        System.out.println("b is: "+ b);

    }
}
