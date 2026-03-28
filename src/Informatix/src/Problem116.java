package Informatix.src;

import java.util.Arrays;
import java.util.Scanner;

public class Problem116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] a = new String[n.length()];
        for (int i = 0; i < n.length(); i++) {
            a[i] = String.valueOf(Integer.parseInt(String.valueOf(n.charAt(i))));
        }
        Arrays.sort(a);
        System.out.println(a[0] + " " + a[a.length - 1]);
    }
}
