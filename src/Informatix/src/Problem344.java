package Informatix.src;

import java.util.Scanner;

public class Problem344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') {
                res += Math.pow(2, a.length() - 1 - i);
            }
        }
        System.out.println(res);
    }
}
