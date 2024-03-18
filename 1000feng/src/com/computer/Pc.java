package com.computer;

public class Pc extends Computer{
    private String brand;//brand品牌

    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void printfInfo(){
        //输出
        System.out.println("PC信息=");
        //调用父类的getDatils方法
        System.out.println(getDetails()+" brand="+brand);
    }
}
