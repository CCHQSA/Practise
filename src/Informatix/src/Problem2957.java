package Informatix.src;

import java.util.Scanner;

public class Problem2957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = Boolean.compare((n % m == 0) || (m % n == 0), false);
        System.out.println(result);

    }
}

