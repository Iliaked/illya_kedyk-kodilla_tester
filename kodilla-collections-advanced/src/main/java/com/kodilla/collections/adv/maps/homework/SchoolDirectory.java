package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();

        Principal principal1 = new Principal("Jan Nowak");
        School school1 = new School("Liceum N1", generateClassSizes());
        schoolMap.put(principal1, school1);

        Principal principal2 = new Principal("Barbara Kowalska");
        School school2 = new School("Technikum N5", generateClassSizes());
        schoolMap.put(principal2, school2);

        Principal principal3 = new Principal("Robert Lewandowski");
        School school3 = new School("Szkoła gastronomiczna N2", generateClassSizes());
        schoolMap.put(principal3, school3);

        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();

            System.out.println("Principal: " + principal.getName());
            System.out.println("School: " + school.getName());
            System.out.println("Total number of students: " + school.getTotalStudents());
            System.out.println();
        }
    }

    private static List<Integer> generateClassSizes() {
        List<Integer> classSizes = new ArrayList<>();
        classSizes.add(25);
        classSizes.add(30);
        classSizes.add(28);
        return classSizes;
    }
}