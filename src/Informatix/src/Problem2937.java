package Informatix.src;

import java.util.Scanner;

public class Problem2937 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a + 1;
        int c = a - 1;
        System.out.println( "The next number for the number " + a + " is " + b + ".");
        System.out.println( "The previous number for the number " + a + " is " + c + ".");
    }
}
