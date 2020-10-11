package BinaryTree;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTree {
    static class N{
        int level;
        TreeNode node;
        public N(int level,TreeNode node){
            this.level=level;
            this.node=node;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return null;
        }
        Queue<N> queue=new LinkedList<>();
        queue.add(new N(0,root));//为静态内部类新建对象
        while(!queue.isEmpty()){
            N n1=queue.remove();
            int levels= n1.level;
            TreeNode node1=n1.node;

            if(n1.level==list.size()){//需要创建新的列表的时候
                list.add(new ArrayList<>());
            }
            List<Integer> innerList=list.get(list.size()-1);//得到外部列表的最后一个元素
            innerList.add((int) node1.value);
            if(node1.left!=null){
            queue.add(new N(levels+1,node1.left));
            }
            if(node1.right!=null) {
                queue.add(new N(levels + 1, node1.right));
            }
        }
        return list;
    }
    public static void main(String[] args){
        TreeNode root=BuildTree.Tree1();
        levelOrder(root);
    }
}
