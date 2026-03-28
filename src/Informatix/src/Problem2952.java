package Informatix.src;

import java.util.Scanner;

public class Problem2952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int th1 = scanner.nextInt();
        int tm1 = scanner.nextInt();
        int ts1 = scanner.nextInt();
        int th2 = scanner.nextInt();
        int tm2 = scanner.nextInt();
        int ts2 = scanner.nextInt();

        th1 = th1 * 3600;
        tm1 = tm1 * 60;
        int tres1 = th1 + tm1 + ts1;

        th2 = th2 * 3600;
        tm2 = tm2 * 60;
        int tres2 = th2 + tm2 + ts2;

        System.out.println(tres2 - tres1);
    }
}
