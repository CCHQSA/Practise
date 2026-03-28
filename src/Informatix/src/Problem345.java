package Informatix.src;

import java.util.Scanner;

public class Problem345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n1; i++) {
            int n2 = sc.nextInt();
            if (n2 == 0) {
                res++;
            }
        }
        System.out.println(res);

    }
}

