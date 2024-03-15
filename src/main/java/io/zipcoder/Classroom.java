package io.zipcoder;

//import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private ArrayList<Student> students;

    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){//new Classroom with max class size
        this.students = new ArrayList<>(maxNumberOfStudents);
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students){
        this.students = new ArrayList<>(List.of(students));
    }

    public Classroom(){//Instantiates new classroom
        this.students = new ArrayList<>(30);
        this.maxNumberOfStudents = 30;
    }

    public Student[] getStudents() {
        return this.students.toArray(new Student[0]);
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
