public class BST {

    BST() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
            this.height = 1;
        }
    }

    private Node root;

    // 🔹 ADD THIS (needed for BSTMain)
    public Node getRoot() {
        return root;
    }

    private int HT(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    // ---------------- INSERT ----------------

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
        }

        root.height = Math.max(HT(root.left), HT(root.right)) + 1;
        return root;
    }

    // ---------------- TRAVERSALS ----------------

    public void preorder(Node rootNode) {
        if (rootNode == null) return;
        System.out.print(rootNode.value + " ");
        preorder(rootNode.left);
        preorder(rootNode.right);
    }

    public void inorder(Node rootNode) {
        if (rootNode == null) return;
        inorder(rootNode.left);
        System.out.print(rootNode.value + " ");
        inorder(rootNode.right);
    }

    public void postorder(Node rootNode) {
        if (rootNode == null) return;
        postorder(rootNode.left);
        postorder(rootNode.right);
        System.out.print(rootNode.value + " ");
    }

    public void display() {
        inorder(root);
        System.out.println();
    }

    // ---------------- DELETE ----------------

    public void delete(int key) {
        root = delete(root, key);
    }

    private Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.value) {
            root.left = delete(root.left, key);
        } else if (key > root.value) {
            root.right = delete(root.right, key);
        } else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node successor = minValueNode(root.right);
            root.value = successor.value;
            root.right = delete(root.right, successor.value);
        }

        root.height = Math.max(HT(root.left), HT(root.right)) + 1;
        return root;
    }

    private Node minValueNode(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}