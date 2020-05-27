package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Teachers> teachers=new ArrayList<>();
        List<Students> students=new ArrayList<>();

        Students auro= new Students("1", "auro", "A");
        auro.payFee(5000);
        auro.payFee(500);
        auro.payFee(500);

        Students mithi= new Students("1", "mithi", "A");
        mithi.payFee(2000);
        mithi.payFee(5000);
        mithi.payFee(500);

        students.add(auro);
        students.add(mithi);

        Teachers a=new Teachers("1", "a",3000);
        Teachers b=new Teachers("1", "a",2000);

        b.incrementSalary(100);

        teachers.add(a);
        teachers.add(b);

        School zilla=new School("zilla School", teachers, students);

        System.out.println("-------------------");

        System.out.println(zilla.funAvailable());
    }
}
