package Informatix.src;

import java.util.Scanner;


public class Problem341 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int count = 0;

        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                count++;
                if (i != x / i) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
