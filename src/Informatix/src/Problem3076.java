package Informatix.src;

import java.util.Scanner;

public class Problem3076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean isEven = false;
        boolean b1 = a % 2 == 0;
        boolean minusOne = false;
        while (a != b) {
            if (b * 2 > a){
                minusOne = true;
            }
            if (minusOne){
                a -= 1;
                System.out.println("-1");
                continue;
            }
            if (a % 2 == 0){
                a /= 2;
                System.out.println(":2");
            }else {
                a -= 1;
                System.out.println("-1");
            }
        }
    }
}

