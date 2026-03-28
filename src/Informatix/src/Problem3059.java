package Informatix.src;

import java.util.Scanner;

public class Problem3059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int two = 1;

        while (two <= n) {
            System.out.print(two + " ");
            two *= 2;
        }
    }
}
