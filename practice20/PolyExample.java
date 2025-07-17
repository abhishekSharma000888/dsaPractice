package practice20;

public class PolyExample {
    // Overloaded method with int parameters
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Sum of integers: " + result);
    }

    // Overloaded method with double parameters
    public void add(double a, double b) {
        double result = a + b;
        System.out.println("Sum of doubles: " + result);
    }

    public static void main(String[] args) {
        PolyExample obj = new PolyExample();
        obj.add(4, 6);          // calls int version
        obj.add(11.2, 13.4);    // calls double version
    }
}
