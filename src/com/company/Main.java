package com.company;

public class Main {

    public static void main(String[] args) {

        Employee newEmployee = new Employee("123","name","lastname", 12);

        System.out.println(newEmployee.anualPay());

        newEmployee.increaseSalary();

    }
}
