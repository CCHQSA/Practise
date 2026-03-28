package Informatix.src;

import java.util.Scanner;

public class Problem317 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int nFactorial = factorial(n);
        int kFactorial = factorial(k);
        int nMinusKFactorial = factorial(n - k);

        int result = nFactorial / (kFactorial * nMinusKFactorial);

        System.out.println(result);
    }

    private static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}
