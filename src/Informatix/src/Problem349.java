package Informatix.src;

import java.util.*;

public class Problem349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        List<Integer> roots = new ArrayList<>();

        for (int x = 0; x <= 1000; x++) {
            long val = (long)a * x * x * x +
                    (long)b * x * x +
                    (long)c * x +
                    d;

            if (val == 0) {
                roots.add(x);
            }
        }
        roots.sort(Collections.reverseOrder());


        for (int r : roots) {
            System.out.print(r + " ");
        }
    }
}