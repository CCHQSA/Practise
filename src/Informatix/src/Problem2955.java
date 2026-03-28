package Informatix.src;

import java.util.Scanner;

public class Problem2955 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;

        while (h > 0){
            if (h - a <= 0){
                count++;
                break;
            }
            h = h - a + b;
            count++;
        }

        System.out.println(count);
    }
}
