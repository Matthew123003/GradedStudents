package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private Double[] testScores;
    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
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



    public String getExamScores() {
        String stringScores =  "Exam Scores:";
        for(int i = 0; i < examScores.size(); i++){
            stringScores += "\n" + " Exam " + (i + 1) + " -> " + examScores.get(i);
        }
        return stringScores;
    }

    public double getExamScoresTotal(){
        double total = 0;
        for(int i = 0; i < examScores.size(); i++){
            total += examScores.get(i);
        }
        return total;
    }


    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
            examScores.set(examNumber - 1, newScore);
    }

    public double getAverageExamScore(){
        double sum = 0;
        for(int i = 0; i < examScores.size(); i++){
            sum += examScores.get(i);
        }
        return sum / examScores.size();
    }
    @Override
    public String toString(){
        return "Student Name: " + this.firstName + " " + this.lastName +"\n> Average Score: " +
                getAverageExamScore() + "\n> " + getExamScores();
    }
}
