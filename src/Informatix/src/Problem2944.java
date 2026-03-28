package Informatix.src;

import java.util.Scanner;

public class Problem2944 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a % 100 % 10 + (a % 100 - a % 100 % 10) / 10 + a / 100);
    }
}
