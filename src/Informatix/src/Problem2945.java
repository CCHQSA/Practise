package Informatix.src;

import java.util.Scanner;

public class Problem2945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b + 2 - b % 2);
    }
}
