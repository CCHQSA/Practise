package Informatix.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem3063 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long x = Long.parseLong(br.readLine());
        long p = Long.parseLong(br.readLine());
        long y = Long.parseLong(br.readLine());

        int years = 0;

        if (p == 0) {
            System.out.println(x >= y ? 0 : 0);
            return;
        }

        while (x < y) {
            x += x * p / 100;
            years++;
        }

        System.out.println(years);
    }
}
