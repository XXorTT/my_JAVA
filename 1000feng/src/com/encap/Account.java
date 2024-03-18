package com.encap;

public class Account {
    private String name;
    private double balance;//余额
    private String pwd;

    //提供两个构造器


    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }else {
            System.out.println("名字要求（长度为2.3.4位），默认值 无名");
            this.name="无名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>20){
            this.balance = balance;
        }
        else{
            System.out.println("余额必须>20,默认为0");

        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length()==6){
            this.pwd = pwd;
        }else{
            System.out.println("密码是无效的，必须为6位，默认值");
            this.pwd="000000";
        }

    }

    //显示账号信息
    public void showInfo(){
        //可以增加权限的校验
        System.out.println("账户信息 name="+name+"余额="+balance+ " 密码"+pwd);
    }
}
