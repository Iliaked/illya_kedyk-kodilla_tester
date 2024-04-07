package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTestSuite {

    @Test
    void testShowStudentsAndTeachers_EmptyList() {
        List<Student> students = new ArrayList<>();

        String result = Application.showStudentsAndTeachers(students);

        assertEquals("", result);
    }

    @Test
    void testShowStudentsAndTeachers_WithTeachers() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Tomasz Nowak")));
        students.add(new Student("Kasia Dudek", new Teacher("Monika Błaszczykowska")));

        String result = Application.showStudentsAndTeachers(students);

        String expectedOutput = "Uczeń: Jan Kowalski, nauczyciel: Tomasz Nowak\n" +
                "Uczeń: Kasia Dudek, nauczyciel: Monika Błaszczykowska\n";
        assertEquals(expectedOutput, result);
    }

    @Test
    void testShowStudentsAndTeachers_WithoutTeachers() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", null));
        students.add(new Student("Kasia Dudek", null));

        String result = Application.showStudentsAndTeachers(students);

        String expectedOutput = "Uczeń: Jan Kowalski, nauczyciel: <undefined>\n" +
                "Uczeń: Kasia Dudek, nauczyciel: <undefined>\n";
        assertEquals(expectedOutput, result);
    }
}