package Informatix.src;

import java.util.Scanner;

public class Problem2946 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int hours = a / 60;
        int min = a % 60;
        if (hours > 23){
            hours = hours % 24;
        }
        System.out.println(hours + " " + min);
    }
}

