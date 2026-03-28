package Informatix.src;

import java.util.Scanner;

public class Problem343 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            res += a;
        }
        System.out.println(res);
    }
}
