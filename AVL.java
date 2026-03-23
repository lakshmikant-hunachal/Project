public class AVL {

    private static class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
            this.height = 1; // important
        }
    }

    private Node root;

    private int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    // Balance Factor
    private int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        } else {
            return root; // duplicate not allowed
        }

        // update height
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // balance the node
        return rotate(root);
    }

    private Node rotate(Node root) {
        int balance = getBalance(root);

        // LL Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        // RR Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        // LR Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // Right Rotation
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // rotation
        x.right = y;
        y.left = T2;

        // update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // rotation
        y.left = x;
        x.right = T2;

        // update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // (Optional) Inorder Traversal
    public void display() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
}