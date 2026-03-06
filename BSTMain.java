import java.util.Scanner;

public class BSTMain {
    public static void main(String[] args) {
        BST tree=new BST();
        Scanner sc=new Scanner(System.in);
        int option=0;
        do
        {
            System.out.println("1.insert element");
            System.out.println("2.display");
            System.out.println("3.preorder,inorder,postorder");
            System.out.println("delete element");
            System.out.println("5.exit");
            System.out.println("Enter your choice");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    {
                        System.out.println("Enter element value");
                        int val=sc.nextInt();
                        tree.insert(val);
                        System.out.println("insertion is successful");
                        break;
                    }
                case 2:
                    {
                        System.out.println("Enter target value");
                        int tar=sc.nextInt();
                        tree.delete(root, tar);
                    }
            }
        }
    }
}
