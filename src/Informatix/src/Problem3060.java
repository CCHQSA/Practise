package Informatix.src;

import java.util.Scanner;

public class Problem3060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int two = 1;
        boolean isTwo = false;
        while (two <= n) {
            if (n - two == 0) {
                isTwo = true;
            }
            two *= 2;
        }
        if (isTwo){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
