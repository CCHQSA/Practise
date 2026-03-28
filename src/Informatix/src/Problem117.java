package Informatix.src;

import java.util.Scanner;

public class Problem117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a; i++) {
            if ((sum += Math.pow(2, i)) > a){
                break;
            }
        }
        if (count > 4){
            System.out.println("fsdf");
        }
    }
}

