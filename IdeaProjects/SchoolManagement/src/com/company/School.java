package com.company;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private int moneyEarned;
    private int moneySpent;
    private List<Teachers> teachers;
    private List<Students> students;

    public School(String name, List<Teachers> teachers, List<Students> students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
        moneySpent=moneySpent();
        moneyEarned=moneyEarned();
    }

    private int moneySpent() {
        for (Teachers x: teachers){
            moneySpent+=x.getSalary();
        }
        System.out.println("money spent " + moneySpent);
        return moneySpent;
    }

    private int moneyEarned() {
        for (Students y: students){
            moneyEarned+=y.getFeePaid();
        }
        System.out.println("money earned " + moneyEarned);
        return moneyEarned;
    }

    public void addTeacher(Teachers x){
        teachers.add(x);
    }

    public void addStudent(Students y){
        students.add(y);
    }

    public String getName() {
        return name;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public List<Students> getStudents() {
        return students;
    }

    public int funAvailable(){
        return moneyEarned-moneySpent;
    }
}
