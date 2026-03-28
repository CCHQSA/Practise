//import java.util.Scanner;
//
//public class SimpleCalc {
//    public static void main(String[] args) {
//    System.out.println("Write your first num: ");
//    Scanner s1 = new Scanner(System.in);
//    int a = s1.nextInt();
//
//        System.out.println("Write your second num: ");
//    int b = s1.nextInt();
//
//        System.out.println("Write an option (+, -, *, /, ^): ");
//        s1.nextLine();
//    String c = s1.nextLine();
//
//    int res = 0;
//
//        if (c.equals("+")) {
//        res = a + b;
//        System.out.println("Result: " + res);
//    }
//
//        if (c.equals("-")) {
//        res = a - b;
//        System.out.println("Result: " + res);
//    }
//
//        if (c.equals("*")) {
//        res = a * b;
//        System.out.println("Result: " + res);
//    }
//
//        if (c.equals("/")) {
//        if (b != 0) {
//            res = a / b;
//            System.out.println("Result: " + res);
//        } else {
//            System.out.println("Cannot divide by zero.");
//        }
//    }
//
//        if (c.equals("^")) {
//        res = (int) Math.pow(a, b);
//        System.out.println("Result: " + res);
//    }
//}
//}
