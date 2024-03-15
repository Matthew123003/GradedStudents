package io.zipcoder;

import org.junit.Test;

import java.lang.reflect.Array;

public class ClassroomTest {

    @Test
    public void getStudentTest(){
        //Given
        Student s1 = new Student("Matt", null, null);
        Student s2 = new Student("Anthony", null,null);
        Student s3 = new Student("Andy", null, null);
        Student[] students = {s1, s2, s3};
        String expected = "Matt, Anthony, Andy";
        Classroom cm = new Classroom(students);

        //When
        Student[] actual = cm.getStudents();
    }
}
