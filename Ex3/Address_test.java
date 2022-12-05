package com.metanit.Ex3;

public class Address_test {
    public static void main(String[] args) {
        Address A1 = new Address("Россия, Московская область   ,    Москва, проспект Вернадского, 78, 7, Г-226-1");
        Address A2 = new Address("UK, London, London, Trafalgar square, 2, 3, 4, DDD,,,");
        Address A3 = new Address("Страна; регион;     город    . Улица, дом, корпус. Квартира");

        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);

    }
}
