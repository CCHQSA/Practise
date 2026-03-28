package LeetCode;

class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftRes = 0;
        while (left != null){
            leftRes++;
            if (left.left != null){
                left = left.left;
            }else {
                break;
            }
        }

        int rightRes = 0;
        while (right != null){
            rightRes++;
            if (right.right != null){
                right = right.right;
            }else {
                break;
            }
        }
        return (rightRes = leftRes) > 1 ;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}