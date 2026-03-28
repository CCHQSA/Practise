package Informatix.src;

import java.util.Scanner;

public class Problem2951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int rub = 0;

        if (b * n >= 100){
            rub = b * n / 100;
            a = a * n + rub;
            b = b * n % 100;
        }else {
            a = a * n;
            b = b * n;
        }


        System.out.println(a + " " + b );
    }
}
