package Informatix.src;

import java.util.Scanner;

public class Problem2936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        double res = Math.sqrt(a * a + b * b);
        System.out.println(res);
    }

}
