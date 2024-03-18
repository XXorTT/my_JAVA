package com;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Test test = new Test(1, "2");
        System.out.println(test);
    }

    public Test() {
    }

    public Test(int num) {
        this.num = num;
    }

    public Test(String name) {
        this.name = name;
    }

    private int num;
    private String name;

    public Test(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return num == test.num && Objects.equals(name, test.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }

    @Override
    public String toString() {
        return "Test{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
