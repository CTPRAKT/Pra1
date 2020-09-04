package com.company;

public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String n, int a) {
        name = n;
        age = a;
    }

    public void humanAge() {
        age = age * 7;
        System.out.println("dogName" + name + "age in human years" + age);
    }

}
