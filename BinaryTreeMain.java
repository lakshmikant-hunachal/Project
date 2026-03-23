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
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        boolean first=false;
        boolean last=false;
        int n=intervals.length;
        int m=intervals[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<intervals.length;i++)
        {
            for(int j=0;j<intervals[i].length;j++)
            {
                if(intervals[i][j]>=newInterval[0]);
                {
                    if(!first)
                    {
                        intervals[i][j]=newInterval[j];
                        first=true;
                    }
                    
                }
                else if(newInterval[0]<intervals[i][j]>newInterval[1])
                {
                    ans[i][j]=intervals[i][j];
                }
                else
                {
                    if(!last)
                    {
                        intervals[i][j]=newInterval[1];
                        last=true;
                    }
                }
            }
        }
        return ans;
    }
}