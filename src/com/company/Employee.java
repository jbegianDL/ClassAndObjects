package com.company;
import java.util.Scanner;

public class Employee {
    private String idNumber;
    private String firstName;
    private String lastName;
    private double hourlyPay;
    private double anualPay;

    public Employee(String idNumber, String firstName, String lastName, double hourlyPay) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPay = hourlyPay;
    }

    public double anualPay(){
        anualPay = (40 * hourlyPay) * 52;
        return anualPay;
    }

    public void increaseSalary(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a percent: ");
        double usrInput = input.nextDouble();
        double percent = usrInput * 0.01;
        anualPay = anualPay + (anualPay * percent);
        System.out.println(percent);
        System.out.println(anualPay);
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
