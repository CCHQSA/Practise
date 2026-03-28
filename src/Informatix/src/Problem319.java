package Informatix.src;

import java.util.Scanner;

public class Problem319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int n = scanner.nextInt();

        double term = 1;
        double sum = 1;

        for (int i = 1; i <= n; i++) {
            term *= a;
            sum += term;
        }

        System.out.println(sum);
    }
}