import java.util.Scanner;
 public class Main{
    static class TreeNode{
        static char val;
        static TreeNode right;
        static TreeNode left;
        TreeNode(char val){
            this.val=val;
            this.right=null;
            this.left=null;
        }
    }
    public static TreeNode buildTree(String str){
        int []index=new int[]{0};
        
        return createTree(str,index);
    }
    public static TreeNode createTree(String str,int[] index){
        char c=str.charAt(index[0]);
        if(c=='#'){
            return null;
        }else{
            TreeNode root=new TreeNode(c);
            ++index[0];
            root.left=createTree(str,index);
            ++index[0];
            root.right=createTree(str,index);
            return root;
        }
    }
    public static void getMidTravel(TreeNode root){
        if(root==null){
            return;
        }
        getMidTravel(root.left);
        System.out.print(root.val+" ");
        getMidTravel(root.right);
        
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        String s=sc.next();
            TreeNode node=buildTree(s);
            getMidTravel(node);
            System.out.println();
        }
        sc.close();
    }
}