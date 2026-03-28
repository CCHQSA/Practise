package Informatix.src;

import java.util.Scanner;

public class Problem350 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int count = 0;

        for (int x = 0; x <= 1000; x++) {
            if (x == e) continue;

            long num = (long)a * x * x * x
                    + (long)b * x * x
                    + (long)c * x
                    + d;

            if (num == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
