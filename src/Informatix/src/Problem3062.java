package Informatix.src;

import java.util.Scanner;

public class Problem3062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double currentDistance = x;
        int days = 1;

        while (currentDistance < y) {
            currentDistance += currentDistance * 0.1;
            days++;
        }

        System.out.println(days);
    }
}