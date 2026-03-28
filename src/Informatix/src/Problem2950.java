package Informatix.src;

import java.util.Map;
import java.util.Scanner;

public class Problem2950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int lesson = s.nextInt();
        Map<Integer, String> map = Map.of(
                1, "9 45",
                2, "10 35",
                3, "11 35",
                4, "12 25",
                5, "13 25",
                6, "14 15",
                7, "15 15",
                8, "16 05",
                9, "17 05",
                10, "17 55"
        );
        System.out.println(map.get(lesson));
    }
}
