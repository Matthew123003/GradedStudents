package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private Double[] testScores;
    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Double[] getTestScores() {
        return testScores;
    }

    public void setTestScores(Double[] testScores){
        this.testScores = testScores;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public double addExamScore(double examScore){
        return examScore;
    }

    public void setExamScore(int examNumber, double newScore){
        if(examNumber >= 1 && examNumber <= examScores.size()){
            examScores.set(examNumber - 1, newScore);
        }
    }
}
