//import java.util.*;
//
//public class sumOfMaxElements {
//
//
//    public static long maxInArray(int[] arr) {
//
//
//        System.out.println("Length of an array: " + arr.length);
//        System.out.println("Input amount of max numbers to sum: ");
//        Scanner userInput = new Scanner(System.in);
//        int x = userInput.nextInt();
//
//
//        if (x > arr.length) {
//            System.out.println("Write number between 1 and " + arr.length);
//        }
//
//        List al = Arrays.asList(arr);
//        System.out.println(al);
//
//
//
//
//
//
//
//
////        int maxElement = arr[0];
////        int secMaxElement = arr[0];
////        int thirdMaxElement = arr[0];
////
////        for (int i = 0; i < arr.length; i++) {
////            if(arr[i] > maxElement){
////                thirdMaxElement = secMaxElement;
////                secMaxElement = maxElement;
////                maxElement = arr[i];
////            } else if(arr[i] > secMaxElement){
////                thirdMaxElement = secMaxElement;
////                secMaxElement = arr[i];
////            } else if(arr[i] > thirdMaxElement){
////                thirdMaxElement = arr[i];
////            }
////        }
////        return  maxElement +  (long) secMaxElement + thirdMaxElement;
//
//        return 0;
//    }
//}
//
