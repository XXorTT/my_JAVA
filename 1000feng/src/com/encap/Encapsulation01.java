package com.encap;
//封装的入门
public class Encapsulation01 {
    public static void main(String[] args) {
        //如果要使用快捷键需要先配置主类
        //可以鼠标右键Run运行，就可以直接生成相关配置
        Person person = new Person();
//      person.name = "jack";
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
//      person.age=3000;       age已经被私有化不能在这里被修改
    //如果我们直接使用构造器属性
        Person smith=new Person("smith",2000,50000);
        System.out.println("====Smith的信息====");
        System.out.println(smith.getSalary());
    }
}


class Person{
    public  String name;//名字公开
    private int age;//age 私有化
    private double salary;//salary 工资 月薪


    //构造器Alt+Insert
    public Person() {

    }
    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
    //我们可以将set方法写在构造器中，这样仍然可以验证
    setName(name);
    setAge(age);
    setSalary(salary);
    }

    //自己写这个setXXX和getXXX太慢了
    //可以使用快捷键
    //Alt+Insert
    public void setName(String name){
        //加入了对数据的校验
        if(name.length()>=2&&name.length()<=6){
            this.name=name;
        }else{
            System.out.println("名字的长度不对，需要（2-6）个字符，默认名字为");
            this.name="无名人";
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        //判断
        if(age >= 1 && age <= 120){//如果是合理范围
            this.age = age;
        }else {
            System.out.println("你设置的年龄不正确，需要在1-120，给默认年龄18");
            this.age=18;//给一个默认年龄18
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    //写一个方法返回信息属性
    public String info(){
        return "信息为 name="+name+" age="+age+" 薪水="+salary;
    }
}