package com.metanit.Ex2;

public class Person_test {
    public static void main(String[] args) {

        Person P1 = new Person("Анастасия","Обухова","Михайловна");
        Person P2 = new Person("Обухова");

        System.out.println(P1.toString());
        System.out.println(P2.toString());
    }
}
