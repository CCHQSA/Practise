package Informatix.src;

import java.util.Scanner;

public class Problem347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        boolean isZero = false;
        for (int i = 0; i < n1; i++) {
            int n2 = sc.nextInt();
            if (n2 == 0){
                isZero = true;
            }
        }
        if (isZero){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
