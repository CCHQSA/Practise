package Informatix.src;

import java.util.Scanner;

public class Problem2943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a % 100 / 10;
        System.out.println(a);
    }
}
