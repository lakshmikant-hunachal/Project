public class BST {

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
   public Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.val) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }
    public void display()
    {
        display(root);
    }
    private void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        display(root.left);
        System.out.print(root.val+" ");
        display(root.right);
    }
    /*pre order travesal */
    public void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    private Node findMin(Node root) {
    while (root.left != null) {
        root = root.left;
    }
    return root;
}
   public Node delete(Node root, int target) {

    if (root == null) {
        return null;
    }

    if (target < root.val) {
        root.left = delete(root.left, target);
    }
    else if (target > root.val) {
        root.right = delete(root.right, target);
    }
    else {

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
        Node minNode = findMin(root.right);
        root.val = minNode.val;
        root.right = delete(root.right, minNode.val);
    }

    return root;
}
    }