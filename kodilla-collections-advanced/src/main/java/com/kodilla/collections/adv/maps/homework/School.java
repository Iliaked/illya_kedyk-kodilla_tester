package com.kodilla.collections.adv.maps.homework;

import java.util.List;

class School {
    private String name;
    private List<Integer> classSizes;

    public School(String name, List<Integer> classSizes) {
        this.name = name;
        this.classSizes = classSizes;
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        int totalStudents = 0;
        for (int classSize : classSizes) {
            totalStudents += classSize;
        }
        return totalStudents;
    }
}
