package io.zipcoder;

//import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.lang.reflect.Array;
import java.util.*;

public class Classroom {

    private Student[] students;

    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){//new Classroom with max class size
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){//Instantiates new classroom
        this.maxNumberOfStudents = 30;
        this.students = new Student[maxNumberOfStudents];
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void addStudent(Student student){
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = student;
                break;
            }
        }

    }

    public double getAverageExamScore(){
        int counter = 0;
        double total = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                counter++;
                total += students[i].getExamScoresTotal();
            }else{
                break;
            }
        }

        return total / counter;
    }

    public void removeStudent(String firstName, String lastName){
        for(int i = 0; i < students.length - 1; i++){
            if(students[i].getFirstName().equalsIgnoreCase(firstName) &&
            students[i].getLastName().equalsIgnoreCase(lastName)){
                students[i] = students[i + 1];
            }
        }
        if(students[students.length -1].getFirstName().equalsIgnoreCase(firstName) &&
                students[students.length - 1].getLastName().equalsIgnoreCase(lastName)){
            students[students.length - 1] = null;
        }
    }

    public Student[] getStudentsByScore(){
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int o1Score = Integer.parseInt(o1.getExamScores());
                int o2Score = Integer.parseInt(o2.getExamScores());

                int scoreCompare = Integer.compare(o1Score, o2Score);
                if(scoreCompare != 0){
                    return scoreCompare;
            } else {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
            }
        });
        return students;
    }


    public Map<Student, String> getGradeBook(){
        return null;
    }

}
