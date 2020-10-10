package BinaryTree;

import sun.reflect.generics.tree.Tree;

public class BuildTree {
    public static TreeNode Tree1(){
    TreeNode a=new TreeNode('A');
    TreeNode b=new TreeNode('B');
    TreeNode c=new TreeNode('C');
    TreeNode d=new TreeNode('D');
    TreeNode e=new TreeNode('E');
    TreeNode f=new TreeNode('F');
    TreeNode g=new TreeNode('G');
    TreeNode h=new TreeNode('H');
    TreeNode i=new TreeNode('I');
    a.left=b;
    a.right=c;
    b.left=e;
    b.right=f;
    c.right=i;
    f.right=h;
    f.left=g;
    h.right=d;
    return a;
    }
}
