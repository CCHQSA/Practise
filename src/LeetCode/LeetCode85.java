//public class LeetCode85 {
//    public int maximalRectangle(String[][] matrix) {
//        int area = 0;
//
//        boolean[][] booleanMatrix = new boolean[matrix.length][matrix[0].length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j].equals("1")) {
//                    booleanMatrix[i][j] = true;
//                } else {
//                    booleanMatrix[i][j] = false;
//                }
//            }
//        }
//
//        int[] indexes = new int[];
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        String[][] chars = new String[][]{
//                {"1","0","1","0","0"},
//                {"1","0","1","1","1"},
//                {"1","1","1","1","1"},
//                {"1","0","0","1","0"}
//        };
//        LeetCode85 leetCode85 = new LeetCode85();
//
//        System.out.println(leetCode85.maximalRectangle(chars));
//
//    }
//}
//
//
