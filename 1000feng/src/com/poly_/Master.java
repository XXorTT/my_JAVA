package com.poly_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //主任给小狗 喂食 骨头
    public void feed(Dog dog,Bones bone){
        System.out.println("主人 "+ name+" 给 "+dog.getName()+" 吃 "+ bone.getName());
    }
}
