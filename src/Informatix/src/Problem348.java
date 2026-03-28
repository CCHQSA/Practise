package Informatix.src;

import java.util.Scanner;

public class Problem348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int x;

        for (int i = 0; i <= 1000; i++) {
            x = i;
            if ((a*Math.pow(x, 3) + b*Math.pow(x, 2) + c*x + d) == 0){
                System.out.print(i + " ");
            }
        }
    }
}
