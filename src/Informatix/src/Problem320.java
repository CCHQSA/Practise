package Informatix.src;

import java.util.Scanner;

public class Problem320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * (double) i);
        }
        System.out.print(sum);
    }
}
