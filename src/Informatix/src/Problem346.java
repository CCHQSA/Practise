package Informatix.src;

import java.util.Scanner;

public class Problem346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int resZeros = 0;
        int resPositive = 0;
        int resNegative = 0;
        for (int i = 0; i < n1; i++) {
            int n2 = sc.nextInt();
            if (n2 == 0) {
                resZeros++;
            } else if (n2 > 0) {
                resPositive++;
            } else {
                resNegative++;
            }
        }
        System.out.println(resZeros + " " + resPositive + " " + resNegative);
    }
}
