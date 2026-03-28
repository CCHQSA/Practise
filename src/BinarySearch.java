import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middlePos = (low + high) / 2;
            int middle = arr[middlePos];

            if (middle == target) {
                return middlePos;
            }
            if (target > middle) {
                low = middlePos + 1;
            } else {
                high = middlePos - 1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 4));
    }
}
