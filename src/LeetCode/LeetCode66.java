//import java.util.Arrays;
//
//public class LeetCode66 {
//    public int[] plusOne(int[] digits) {
//        boolean isTen = false;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            int digit = digits[i] + 1;
//            if (digit == 10) {
//                isTen = true;
//                digits[i] = 0;
//                continue;
//            } else {
//                digits[i] += 1;
//                isTen = false;
//                break;
//            }
//
//        }
//
//        if (isTen) {
//            int[] ints = new int[digits.length + 1];
//            ints[0] = 1;
//            for (int i = 1; i < digits.length; i++) {
//                ints[i] = digits[i];
//            }
//            return ints;
//        }
//        return digits;
//    }
//}
//
//    public static void main(String[] args) {
//        LeetCode66 leetCode66 = new LeetCode66();
//        System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1, 3, 4})));
//        System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{1, 3, 9})));
//        System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{9, 9})));
//        System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{9})));
//        System.out.println(Arrays.toString(leetCode66.plusOne(new int[]{8, 9, 9, 9})));
//    }
//
//
//}
//
//
