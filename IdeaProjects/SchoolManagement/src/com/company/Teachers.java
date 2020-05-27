package com.company;

public class Teachers {
    private String id;
    private String name;
    private int salary;

    public Teachers(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;

    }

    public int getSalary() {
        return salary;
    }

    public void incrementSalary(int amount) {
        this.salary += amount;
        System.out.println("updated salary is: " + salary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
