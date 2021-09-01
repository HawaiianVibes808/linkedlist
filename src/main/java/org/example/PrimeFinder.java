package org.example;

public class PrimeFinder {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int c = 0;
        for (int n = 1; n <= 10; n++) {
            boolean isPrime = isPrime(n);
            if(isPrime) {
                c++;
                System.out.println(n);
            }
        }
        System.out.println("Number of primes in range: " + c);
    }
}


