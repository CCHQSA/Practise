package Informatix.src;

import java.util.Scanner;

public class Problem2948 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amountOfSecs = s.nextInt();
        int mins = amountOfSecs / 60;
        int hours = 0;
        if (mins >= 60){
            hours = mins / 60;
            mins = mins % 60;
        }
        int secs = amountOfSecs - mins * 60 - hours * 3600;
        String mins1;
        String secs1;
        if (mins < 10){
            mins1 = "0" + mins;
        }else {
            mins1 = String.valueOf(mins);
        }

        if (secs < 10){
            secs1 = "0" + secs;
        }else {
            secs1 = String.valueOf(secs);
        }
        System.out.println(hours % 24 + ":" + mins1 + ":" + secs1);
    }
}
