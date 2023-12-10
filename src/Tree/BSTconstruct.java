package Tree;

public class BSTconstruct {

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) // place in left node..
            root.left = insert(root.left, val);
        else// place in right node
            root.right = insert(root.right, val);
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void minVal(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        System.out.println("Min value:- " + temp.data);
    }

    public static void maxValue(Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        System.out.println("Max value: " + temp.data);
    }

    public static int sumOfRoots(Node rootNode) {
        if (rootNode == null)
            return 0;
        int sum = rootNode.data + sumOfRoots(rootNode.left) + sumOfRoots(rootNode.right);

        return sum;

    }

    public static void gettingInput() {
        int[] binaryArr = { 1, 2, 3 };
        Node root = null;
        for (int i = 0; i < binaryArr.length; i++) {
            root = insert(root, binaryArr[i]);
        }
        System.out.print("Pre order :- ");
        preOrder(root);
        System.out.println();
        System.out.print("In order :- ");
        inOrder(root);
        System.out.println();
        System.out.print("Post order :- ");
        postOrder(root);
        System.out.println();
        minVal(root);
        maxValue(root);
        System.out.println();
        System.out.print("Sum of root: " + sumOfRoots(root));
    }

    public static void main(String[] args) {
        gettingInput();
    }
}
