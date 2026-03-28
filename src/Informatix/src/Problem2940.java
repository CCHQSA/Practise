package Informatix.src;

import java.util.Scanner;

public class Problem2940 {
        public static void main(String[] args) {
            final int mcad = 109;
            Scanner scanner = new Scanner(System.in);
            int v = scanner.nextInt();
            int t = scanner.nextInt();
            int s = v*t;

            int res = (s % mcad  + mcad) % mcad;
            System.out.println(res);
    }
}
