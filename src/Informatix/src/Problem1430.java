package Informatix.src;

import java.util.Scanner;

public class Problem1430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            for (int j = 0; j < currentNum; j++) {
                if (count != n) {
                    stringBuilder.append(currentNum + " ");
                    count++;
                }

            }
        }
        System.out.println(stringBuilder);
    }
}
