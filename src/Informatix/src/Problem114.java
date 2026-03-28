package Informatix.src;

import java.util.Scanner;

public class Problem114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int res  = 0;
        for (int i = 0; i < n.length(); i++) {
            res += Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        System.out.println(res);
    }
}
