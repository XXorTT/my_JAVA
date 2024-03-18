package com;

public class Person_ {
    private String name;
    private int age;

    public Person_(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String say() {
        return "name" + name + "age= " + age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
