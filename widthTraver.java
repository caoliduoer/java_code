package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
public class widthTraver {

    public static void width(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.remove();
            System.out.print(node.value);
            if(root.left!=null){
                queue.add(node.left);
            }if(root.right!=null){
                queue.add(node.right);
            }
        }
    }
    public static boolean ifCompleteTree(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while (true) {
            if (root == null) {
                break;
            }
            TreeNode node=que.remove();
            que.add(node.left);
            que.add(node.right);
        }
        while(!que.isEmpty()){
            TreeNode node=que.remove();
            if(node!=null){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        TreeNode root=BuildTree.Tree1();//静态方法可以直接使用类名调用，不直接依赖对象
        width(root);
        System.out.println();
        System.out.println(ifCompleteTree(root));
    }
}
