package Informatix.src;

import java.util.Scanner;

public class Problem2956 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int a = p / 1000;
        int b = p / 100 % 10;
        int c = p / 10 % 10;
        int d = p % 10;
        int x = (a - d) | (b - c);
        int result = 1 + x * x;

        System.out.println(result);
    }
}
