package com.caoliduo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class ListRemoveDemo {
    static class Teacher{
        String name;
        Teacher(String name){
            this.name=name;
        }

        @Override//对父类方法的重写，加上override后，系统可以帮助检查重写的正确性
        public String toString() {
            return "Teacher{"+
            "name='"+name+
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if(this==obj){
                return true;
            }
            if(!(obj instanceof Teacher)){
                return false;
            }
            Teacher teacher=(Teacher) obj;
            //return Objects.equals()
            return super.equals(Objects.equals(name,teacher.name));
        }
    }
    public static void main(String[] args){
        List<Teacher> list=new ArrayList<>();
        Teacher t1=new Teacher("gao");
        Teacher t2=new Teacher("chen");
        Teacher t3=new Teacher("chen1");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        System.out.println(list);
        list.remove(t2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove("chen1");
        System.out.println(list);
    }
}
