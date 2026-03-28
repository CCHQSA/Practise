package Informatix.src;

import java.util.Scanner;

public class Problem115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '0'){
                count++;
            }
        }
        System.out.println(count);
    }
}
