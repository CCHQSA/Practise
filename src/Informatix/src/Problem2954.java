package Informatix.src;

import java.util.Scanner;

public class Problem2954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println((n - (k % n)) % n);
    }
}
