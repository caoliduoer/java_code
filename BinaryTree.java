package BinaryTree;

public class BinaryTree {
    public static void preTraveral(TreeNode root){
        if(root!=null){
            System.out.print(root.value);
            preTraveral(root.left);
            preTraveral(root.right);
        }
    }
    public static void inTraveral(TreeNode root){
        if(root!=null){
            inTraveral(root.left);
            System.out.print(root.value);
            inTraveral(root.right);
        }
    }
    public static  void postTraveral(TreeNode root){
        if(root!=null){
            postTraveral(root.left);
            postTraveral(root.right);
            System.out.print(root.value);
        }
    }
    public static void main(String[] args) {
        TreeNode a=new TreeNode('A');
        TreeNode b=new TreeNode('B');
        TreeNode c=new TreeNode('C');
        TreeNode d=new TreeNode('D');
        TreeNode e=new TreeNode('E');
        TreeNode f=new TreeNode('F');
        TreeNode g=new TreeNode('G');
        TreeNode h=new TreeNode('H');
        TreeNode i=new TreeNode('I');
        TreeNode j=new TreeNode('J');
        a.left=b;
        a.right=c;
        b.left=d;
        d.right=g;
        g.left=j;
        c.left=e;
        c.right=f;
        f.left=h;
        f.right=i;
        System.out.println("前序遍历：");
        preTraveral(a);
        System.out.println();
        System.out.println("中序遍历：");
        inTraveral(a);
        System.out.println();
        System.out.println("后序遍历：");
        postTraveral(a);
    }
}
