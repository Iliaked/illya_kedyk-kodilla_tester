package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Application {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Kasia Dudek", null));
        students.add(new Student("Jakub Kiwior", new Teacher("Monika Błaszczykowska")));

        System.out.println(showStudentsAndTeachers(students));
    }
    public static String showStudentsAndTeachers(List<Student> students) {
        String result = "";
        for (Student student : students) {
            String studentName = student.getName();
            Teacher teacherName = student.getTeacher();
            String optionalTeacher = Optional.ofNullable(teacherName)
                    .map(Teacher::getName)
                    .orElse("<undefined>");
            result += "Uczeń: " + studentName + ", nauczyciel: " + optionalTeacher + "\n";
        }
        return result;
    }
}
