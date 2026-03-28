package Informatix.src;

import java.util.Scanner;

public class Problem352 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= 2;
        }
        System.out.println(res);
    }
}
