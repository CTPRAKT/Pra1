package com.company;

public class Main {

    public static void main(String[] args) {
        Dog n1 = new Dog ("Stan",5);
        Dog n2 = new Dog ("Flash", 2);
        Dog n3 = new Dog ("Kent",8);
        System.out.println(n1);
        n1.humanAge();
        System.out.println(n1.toString());
        
    }
}
