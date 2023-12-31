package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode leftNode, rightNode;

    public TreeNode(int value) {
        this.data = value;
        this.leftNode = null;
        this.rightNode = null;
    }
}

public class TreeQues {

    TreeNode root;

    public TreeQues() {
        root = null;
    }

    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size(); // Get the number of nodes at this level
            ArrayList<Integer> levelNodes = new ArrayList<>(); // Create a list for nodes at this level

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = q.poll();
                levelNodes.add(current.data);

                if (current.leftNode != null) {
                    q.add(current.leftNode);
                }
                if (current.rightNode != null) {
                    q.add(current.rightNode);
                }
            }

            System.out.println(levelNodes); // Print nodes at this level
        }
    }

    public static int heightOfTree(TreeNode root) {

        if (root == null)
            return 0;
        return Math.max(heightOfTree(root.leftNode), heightOfTree(root.rightNode)) + 1;

    }

    public static void main(String[] args) {
        TreeQues bfs = new TreeQues();
        bfs.root = new TreeNode(1);
        bfs.root.leftNode = new TreeNode(10);
        bfs.root.leftNode.leftNode = new TreeNode(10);
        bfs.root.leftNode.rightNode = new TreeNode(30);
        bfs.root.rightNode = new TreeNode(20);
        bfs.root.rightNode.leftNode = new TreeNode(6);
        System.out.println("Height of tree: " + heightOfTree(bfs.root));
        bfs.levelOrderTraversal();
    }
}
