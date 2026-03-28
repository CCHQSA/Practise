package Informatix.src;

import java.util.Scanner;

public class Problem338 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        String result = "";
        boolean leadingZero = true;
        for (int i = x.length() - 1; i >= 0; i--) {
            char c = x.charAt(i);
            if (leadingZero && c == '0') {
                continue;
            }

            leadingZero = false;
            result += c;
        }

        if (result.equals("")) {
            result = "0";
        }

        System.out.println(result);
    }
}