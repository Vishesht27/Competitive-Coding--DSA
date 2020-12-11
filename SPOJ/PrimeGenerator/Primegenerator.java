import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] primes = new int[4000];
        int numprimes = 0;

        primes[numprimes++] = 2;
        for (int i = 3; i <= 32000; i+=2) {
            boolean isprime = true;
            double cap = Math.sqrt(i) + 1.0;

            for (int j = 0; j < numprimes; j++) {
                if (j >= cap) break;
                if (i % primes[j] == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) primes[numprimes++] = i;
        }
