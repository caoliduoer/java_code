package Map用法;

import org.omg.CORBA.INTERNAL;
import sun.reflect.generics.tree.Tree;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args){

        MyTreeMap map=new MyTreeMap();
        Integer v=map.put("M",87);
        map.put("a", 88);
        System.out.println(v);
        System.out.println(map.get("a"));//88
        System.out.println(map.getOrDefault("l",12));
    }

}
