package Informatix.src;

import java.util.Scanner;

public class Problem337 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int res = 0;
        for (int i = 0; i < x.length(); i++) {
            res += Integer.parseInt(String.valueOf(x.charAt(i)));
        }
        System.out.println(res);
    }
}
