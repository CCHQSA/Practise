package Informatix.src;

import java.util.Scanner;

public class Problem2939 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int res = k % n;
        System.out.println(res);
    }
}
