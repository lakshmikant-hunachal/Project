import java.util.Scanner;

public class AVLMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int option=0;
        AVL tree=new AVL();
        do{
            System.out.println("1.insertion");
            System.out.println("2.deletion");
            System.out.println("3.display");
            System.out.println("4.Exiting");
            System.out.println("Enter your choice");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    {
                        System.out.println("Enter inserted value");
                        int val=sc.nextInt();
                        tree.insert(val);
                        System.out.println("insertion is successful");
                        break;
                    }
                    case 2:
                        {
                            System.out.println("Enter target element for deltion");
                            int value=sc.nextInt();
                            
                            System.out.println("deletion is successful");
                            break;
                        }
                    case 3:
                        {
                           tree.display();
                           break;
                        }
                    case 4:
                        {
                            System.exit(0);
                            break;
                        }
                    default:
                        {
                            System.out.println("you enter invalid choice please enter value choice");
                        }
            }
        }while(option!=4);
    }
}
