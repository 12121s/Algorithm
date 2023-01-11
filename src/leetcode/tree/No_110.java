package leetcode.tree;

public class No_110 {

    public static void main(String[] args) {
        System.out.println(isBalanced(new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)))));

        System.out.println(isBalanced(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2))));

        System.out.println(isBalanced(new TreeNode(1, null,
                new TreeNode(2, null, new TreeNode(3)))));

        //[1,2,2,3,null,null,3,4,null,null,4]
        System.out.println(isBalanced(new TreeNode(1,
                new TreeNode(2, new TreeNode(3, null, new TreeNode(3, new TreeNode(4), null)), null),
                new TreeNode(2, null, new TreeNode(3)))));
    }
    public static boolean isBalanced(TreeNode root) {
        int leftDepth = root != null ? getDepth(root.left, 1) : 0;
        System.out.println("  leftDepth: " + leftDepth);
        int rightDepth = root != null ? getDepth(root.right, 1) : 0;
        System.out.println("  rightDepth: " + rightDepth);
        return Math.abs(leftDepth - rightDepth) < 2;
    }

    public static int getDepth(TreeNode root, int currentDepth) {
        if (root == null)
            return currentDepth - 1;

        if (root.left == null && root.right == null)
            return currentDepth;

        int leftDepth = 0;
        int rightDepth = 0;
        if (root.left != null) {
            leftDepth = getDepth(root.left, currentDepth + 1);
        }
        if (root.right != null) {
            rightDepth = getDepth(root.right, currentDepth + 1);
        }

        return Math.max(leftDepth, rightDepth);
    }
}
