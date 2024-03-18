package com.encap;

public class TestAccount {
    public static void main(String[] args) {
        //创建一个Account
        Account account=new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("123456");

        account.showInfo();
    }
}
