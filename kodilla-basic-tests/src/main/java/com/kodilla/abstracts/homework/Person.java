package com.kodilla.abstracts.homework;

public class Person {
    private String firstname;
    private int age;
    private String job;

    public Person (String firstname, int age, String job) {
        this.firstname = firstname;
        this.age = age;
        this.job = job;
    }

    public void showJob() {
        System.out.println(firstname + " - " + age + " years " + " - " + job);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jan", 40, "Bus driver");
        Person person2 = new Person("Piotr", 27, "Firefighter");

        Job busDriver = new BusDriver();
        Job firefighter = new Firefighter();

        person1.showJob();
        busDriver.showResponsibilities();

        person2.showJob();
        firefighter.showResponsibilities();
    }
}
