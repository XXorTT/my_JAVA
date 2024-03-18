package com.extend_.improve_;

import com.extend_.Graduate;
import com.extend_.Pupil;

public class TestExtends01 {
    public static void main(String[] args) {
        com.extend_.Pupil pupil = new Pupil();
        pupil.name = "银角大王~";
        pupil.age = 13;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("========");
        com.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}
