import java.util.Scanner;

public class BSTMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        BST tree = new BST();

        do {
            System.out.println("\n1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Display (Inorder)");
            System.out.println("4. Traversals (Pre, In, Post)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            option = sc.nextInt();

            switch (option) {

                case 1: {
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    tree.insert(val);
                    break;
                }

                case 2: {
                    System.out.print("Enter value to delete: ");
                    int val = sc.nextInt();
                    tree.delete(val);
                    break;
                }

                case 3: {
                    System.out.print("Tree (Inorder): ");
                    tree.display();
                    break;
                }

                case 4: {
                    System.out.print("Preorder: ");
                    tree.preorder(tree.getRoot());
                    System.out.println();

                    System.out.print("Inorder: ");
                    tree.inorder(tree.getRoot());
                    System.out.println();

                    System.out.print("Postorder: ");
                    tree.postorder(tree.getRoot());
                    System.out.println();
                    break;
                }

                case 5: {
                    System.out.println("Exiting...");
                    break;
                }

                default: {
                    System.out.println("Invalid choice!");
                }
            }

        } while (option != 5);

        sc.close();
    }
}