package LeetCode;

public class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;


        String a = Integer.toString(x);
        boolean res = true;

        for (int i = 0; i < a.length() / 2; i++) {
            if (!(a.charAt(i) == a.charAt(a.length() - 1 - i))) {
                res = false;
                break;
            }
        }

        return res;
    }
}



