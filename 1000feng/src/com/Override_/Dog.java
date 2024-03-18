package com.Override_;

public class Dog extends Animal{
    //解读：
    //1.因为Dog是Animal子类
    //2.Dog的cry方法和Animal的cry定义的形式一样（名称，返回类型，参数
    //这时就说Dog的cry放啊，重写了animal的cry方法

    public void cry(){
        System.out.println("小狗叫：");
    }

    //细节：子类的方法的返回类型和父类方法返回类型一样
    //      或者是父类返回类型的子类  比如父类返回类型时 Obj，子类方法返回类型是String
    public String m1(){
        return  null;
    }
}
