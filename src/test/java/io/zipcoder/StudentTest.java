package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getExamScores(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores =  new ArrayList<>();
        examScores.add(100.0);
        examScores.add(87.0);
        examScores.add(90.0);
        examScores.add(79.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = String.valueOf(student.getExamScores());
        String expected = "Exam Scores:\n Exam 1 -> " + 100.0 + "\n Exam 2 -> " + 87.0 + "\n Exam 3 -> " + 90.0 + "\n Exam 4 -> " + 79.0;

        // Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n Exam 1 -> " + 100.0;

        // Wh
        student.addExamScore(100.0);
        String actual = student.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        String expected = "Exam Scores:\n" + " Exam 1 -> 150.0";

        // When
        student.addExamScore(150);
        student.setExamScore(1, 150.0);
        String actual = student.getExamScores();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetAverageExamScore(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores= new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100);
        student.addExamScore(90);
        student.addExamScore(80);
        student.addExamScore(70);
        Double expected = 85.0;
        Double actual = student.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testToString(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores= new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(100.0);
        String expected = "Student Name: " + firstName + " " + lastName + "\n> Average Score: " +
                        student.getAverageExamScore() + "\n> Exam Scores:\n" + " Exam 1 -> 100.0";

        // When
        String actual = student.toString();

        // Then
        Assert.assertEquals(expected, actual);

    }



}