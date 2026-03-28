package Informatix.src;

import java.util.Scanner;

public class Problem3061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int two = 1;
        int count = 0;

        while (two < n) {
            count++;
            two *= 2;
        }

        System.out.println(count);
    }
}