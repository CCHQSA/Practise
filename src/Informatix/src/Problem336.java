package Informatix.src;

import java.util.Scanner;

public class Problem336 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String d = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == d.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
