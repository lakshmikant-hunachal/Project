import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree bt=new BinaryTree();
        bt.insert(sc);
        System.out.println("binary tree elements are ");
        bt.display();
    }
}
