package com.kodilla.abstracts.homework;

public class Person {
    private String firstname;
    private int age;
    private Job job;

    public Person (String firstname, int age, Job job) {
        this.firstname = firstname;
        this.age = age;
        this.job = job;
    }

    public void showJob() {
        System.out.println(firstname + " - " + age + " years " + " - " + job.getResponsibilities());
    }

    public static void main(String[] args) {
        Job busdriver = new BusDriver();
        Job firefighter = new Firefighter();

        Person person1 = new Person("Jan", 35, busdriver);
        Person person2 = new Person("Olek", 29, firefighter);

        person1.showJob();
        person2.showJob();
    }
}
