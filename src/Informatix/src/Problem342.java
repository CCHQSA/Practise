package Informatix.src;

import java.util.Scanner;

public class Problem342 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        for (int i = 0; i < 100; i++) {
            int a = scanner.nextInt();
            res += a;
        }
        System.out.println(res);
    }
}
