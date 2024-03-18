package com.Override_;

import com.Person_;
import com.Student_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person_ jack =  new Person_("jack",10);
        System.out.println(jack.say());

        Student_ smith = new Student_("smith",20,123456,99.8);
        System.out.println(smith.say());


    }
}
