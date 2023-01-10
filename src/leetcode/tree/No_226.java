package leetcode.tree;

public class No_226 {

    public static void main(String[] args) {
        System.out.println(invertTree(new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1), new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6), new TreeNode(9)))));

        System.out.println(invertTree(new TreeNode(1, new TreeNode(2), null)));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = new TreeNode(root.val);

            if (root.right != null) {
                temp.left = invertTree(root.right);
            }
            if (root.left != null) {
                temp.right = invertTree(root.left);
            }
            return temp;
        }
        return null;
    }

    /**
     * 전위 순회
     * (부모 노드 > 왼쪽 자식 노드 > 오른쪽 자식 노드)
     */
    public static void preorder(TreeNode node) {
        // null이 아닐 떄 까지 재귀적으로 순회
        if(node != null) {
            System.out.print(node.val + " ");	// 부모 노드
            preorder(node.left);	// 왼쪽 자식 노드
            preorder(node.right);	// 오른쪽 자식 노드
        }
    }

    /**
     * 중위 순회
     * (왼쪽 자식 노드 > 부모 노드 > 오른쪽 자식 노드)
     */
    public static void inorder(TreeNode node) {
        if(node != null) {
            inorder(node.left);	// 왼쪽 자식 노드
            System.out.print(node.val + " ");	// 부모 노드
            inorder(node.right);	// 오른쪽 자식 노드
        }
    }

    /**
     * 후위 순회
     * (왼쪽 자식 노드 > 오른쪽 자식 노드 > 부모 노드)
     */
    public static void postorder(TreeNode node) {
        if(node != null) {
            postorder(node.left);	// 왼쪽 자식 노드
            postorder(node.right);	// 오른쪽 자식 노드
            System.out.print(node.val + " ");	// 부모 노드
        }
    }
}
