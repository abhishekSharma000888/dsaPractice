package practice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 36, 37, 54, 89, 99, 9, 11, 34242323, 64564574};

        Set<Integer> primes = new HashSet<>();

        for (int num : arr) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        System.out.println("Prime numbers: " + primes);
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        // Check from 5 to square root of n
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}