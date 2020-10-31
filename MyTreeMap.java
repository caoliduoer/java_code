package Map用法;


import sun.reflect.generics.tree.Tree;

public class MyTreeMap {
    private TreeNode root;
    //private String key;

    public Integer put(String key,Integer value){//新的keyvalue 替换老的keyvalue
       if(root==null){
           root=new TreeNode(key,value);//一定要使用原始节点来给她赋值。
            return null;
       }
       TreeNode current=root;
       TreeNode parent =null;

       while(current!=null) {
           int cmp = key.compareTo(current.key);
           if (cmp == 0) {
               Integer oldvalue = current.value;
               current.value = value;
               return oldvalue;
           } else if (cmp < 0) {
               parent=current;
               current = current.left;
           } else {
               parent=current;
               current = current.right;
           }
       }
       TreeNode node =new TreeNode(key,value);
       int cmp=key.compareTo(parent.key);
       if(cmp<0){
           parent.left=node;
       }else{
           parent.right=node;
       }
       return null;
    }
    public Integer get(String key){//通过key来找到节点，如果存在那么就返回value，否则返回null。
        //this.key = key;
        TreeNode current =root;
        while(current!=null){
            int cmp=key.compareTo(current.key);
            if(cmp==0){
                return current.value;
            }
            else if(cmp<0){
                current=current.left;
            }
            else{
                current=current.right;
            }
        }
        return null;
    }


    public Integer getOrDefault(String key,Integer defaultValue){//通过key值找到相应的value值，如果不存在，返回defaultvalue
        if(get(key)!=null){
            return get(key);
        }
        return defaultValue;
    }
}
