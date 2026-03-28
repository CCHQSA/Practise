import java.util.Arrays;

public class ArithmeticQ1 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        boolean res = false;
        int prev = arr[1] - arr[0];
        boolean cont = true;
        for (int i = 0; i < arr.length; i++) {
            if (cont) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] - arr[i] == prev) {
                        res = true;
                        break;
                    } else {
                        res = false;
                        cont = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        ArithmeticQ1 q = new ArithmeticQ1();
        System.out.println(q.canMakeArithmeticProgression(new int[]{1, 10, 10, 10, 19}));
    }
}
