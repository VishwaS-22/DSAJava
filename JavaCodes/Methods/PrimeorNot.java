package vishwa;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int v) {
        if (v <= 1) {
            return false;
        }
        int m = 2;
        while (m * m <= v) {
            if (v % m == 0) {
                return false;
            }
            m++;
        }
        return m * m > v;
    }
}
