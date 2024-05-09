package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomTest {

    @Test
    public void getStudentTest(){
        //Given
        ArrayList<Double> scores = new ArrayList<>(List.of(100.0));
        Student s1 = new Student("Matt", "Kramer", scores);
        Student[] students = {s1};
        String expected = "["+ s1 +"]";
        Classroom cm = new Classroom(students);

        //When
        Student[] actual = cm.getStudents();

        //Then
        Assert.assertEquals(expected, Arrays.toString(actual));
    }

    @Test
    public void testGetAverageExamScore(){
        //Given
        ArrayList<Double> scores = new ArrayList<>(List.of(100.0, 90.0));
        Student s1 = new Student("Matt", "Kramer", scores);
        Student[] students = {s1};
        double expected = 95.0;
        Classroom cm = new Classroom(students);

        //When
        double actual = s1.getAverageExamScore();

        //Then
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void testAddStudent(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(List.of(100.0, 90.0));
        Student student = new Student("Leon", "Hunter", null);

        // When
        classroom.addStudent(student);
        Student[] afterAdd = classroom.getStudents();
        Integer actual = afterAdd.length;

        // Then
        Assert.assertEquals(student, classroom.getStudents()[0]);

    }

    @Test
    public void testRemoveStudent(){
        // : Given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScores = new ArrayList<>(List.of(100.0, 90.0));
        Student student = new Student("Leon", "Hunter", examScores);
        Student student1 = new Student("Peter", "parker", examScores);
        Integer expected = 1;

        // When
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.removeStudent("Peter", "Parker");
        Student[] students = classroom.getStudents();
        Integer actual = students.length;

        // Then
        Assert.assertEquals(expected, actual);
    }
}
