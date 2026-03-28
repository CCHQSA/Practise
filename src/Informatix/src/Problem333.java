package Informatix.src;

import java.util.Scanner;

public class Problem333 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String res = "";
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                res += i + " ";
            }
        }
        System.out.println(res);
    }
}
