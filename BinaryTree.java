import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {
    public BinaryTree()
    {

    }
    private static class Node{
        int val;
        Node left;
        Node right;
       public Node(int val)
       {
        this.val=val;
       }

    }
    private Node root;
    public void insert(Scanner sc)
    {
        System.out.println("Enter root node value");
        int value=sc.nextInt();
        root=new Node(value);
        insert(sc,root);
    }
    public void insert(Scanner sc,Node root)
    {
       System.out.println("Do you want enter left to "+root.val);
       boolean left=sc.nextBoolean();
       if(left)
       {
        System.out.println("Enter value of the left of "+root.val);
        int value=sc.nextInt();
        root.left=new Node(value);
        insert(sc, root.left);
       }
       System.out.println("Do you want enter right of "+root.val);
       boolean right=sc.nextBoolean();
       if(right)
       {
        System.out.println("Enter value of the right of "+root.val);
        int value=sc.nextInt();
        root.right=new Node(value);
        insert(sc, root.right);
       }
    }
    public void display()
    {
        display(root,"");
    }
    private void display(Node root,String indent)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(indent+root.val);
        display(root.left, indent+"\t");
        display(root.right, indent+"\t");
    }

}
// class Solution {
//     public String removeDuplicateLetters(String s) {
//         if(s.length()==0)
//         {
//             return s;
//         }
//         ArrayList<Character> list=new ArrayList<>();
//         for(int i=0;i<s.length();i++)
//         {
//             if(!list.contains(s.charAt(i)))
//             {
//                 list.add(s.charAt(i));
//             }
//         }
//         StringBuilder sb=new StringBuilder();
//         for(int i=0;i<list.size();i++)
//         {
//             sb.append(list.get(i));
//         }
//         return sb.toString();
//     }
// }
