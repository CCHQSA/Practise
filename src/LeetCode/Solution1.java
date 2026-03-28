package LeetCode;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    int first = nums[i];
                    int sec = nums[j];
                    if (nums[i] + nums[j] == target){
                        res[0] = j;
                        res[1] = i;
                    }
                }

            }

        }
        return res;
    }

    public static void main(String[] args){
        Solution1 s1 = new Solution1();
        int[] arr = {3,2,4};
        int[] res = s1.twoSum(arr, 6);
        System.out.println(res[0] + " " + res[1]);
    }

}

