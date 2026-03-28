package Informatix.src;

import java.util.Scanner;

public class Problem334 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();

        StringBuilder sb = new StringBuilder();

        for (long i = a; i <= b; i++) {
            if (i % d == c) {
                sb.append(i).append(' ');
            }
        }

        if (!sb.isEmpty()) {
            System.out.println(sb.toString());
        }
    }
}