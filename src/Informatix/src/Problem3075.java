package Informatix.src;

import java.util.Scanner;

public class Problem3075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int prev = 0;
        int curr = 1;
        int next = 0;
        while (n != next) {
            prev = curr;
            curr = next;
            next = prev + curr;
            count++;
            if (n == next){
                System.out.println(count);
                break;
            } else if (next > n) {
                System.out.println(-1);
                break;
            }
        }
    }
}

