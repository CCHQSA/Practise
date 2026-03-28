package Informatix.src;

import java.util.Scanner;

public class Problem315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int res = 0;
        for (int i = 0; i <= a; i++) {
            res += (int) Math.pow(i, 2);
        }
        System.out.println(res);
    }
}
