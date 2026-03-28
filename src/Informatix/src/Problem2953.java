package Informatix.src;

import java.util.Scanner;

public class Problem2953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println((m + n - 1) / n);
    }
}
