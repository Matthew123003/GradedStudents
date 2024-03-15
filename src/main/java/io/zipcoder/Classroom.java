package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Classroom {

    private Student[] students;

    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }
}
