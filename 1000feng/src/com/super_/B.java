package com.super_;

public class B extends A{

    public int n1=888;


    public void hi(){
        System.out.println(super.n1+ " "+super.n2+" "+super.n3);
    }

    public void sum(){
        System.out.println("B类的sum方法...");
        //希望调用父类A类的cal方法
        //因为子类B没有cal方法，因此可以用三种方式

        //cal();
        //找这个方法时，顺序为先找本类去调用，如果没有则找父类
        //如果找到了不能调用则报错无法访问（私有的），找不到提示不存在


        super.cal();//直接找父类


        this.cal();//等价cal

        //属性的规则
        //先找本类，没有则找n1，没有找父类
        //父类没有则一直找到objec
        System.out.println("n1="+n1);
        System.out.println(this.n1);

    }

    public void ok(){
        super.test100();
        super.test200();
        super.test300();

    }
    public B(){
        super();
    }

}
