package practice3;

import java.util.HashSet;

public class PrimeNumberExample {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 345678};

        HashSet<Integer> primes = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int n = arr[i];

            if (isPrime(n)) {
                primes.add(n);
            }
        }

        System.out.println("Prime numbers in the array: " + primes);
    }

    // Helper method to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
