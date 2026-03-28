package Informatix.src;

import java.util.Scanner;

public class Problem3074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);

        } else {
            int prev = 0;
            int curr = 1;
            int i = 1;

            while (i < n) {
                int next = prev + curr;
                prev = curr;
                curr = next;
                i++;
            }

            System.out.println(curr);
        }
    }
}