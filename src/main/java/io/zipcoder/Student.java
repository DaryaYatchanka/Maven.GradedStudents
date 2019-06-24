package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Student  {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>();

        this.examScores.addAll(Arrays.asList(examScores));

    }


    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getExamScores() {
        String result = "";
        for (int i = 0; i < examScores.size(); i++) {
            result += "\tExam" + (i + 1) + "->" + examScores.get(i) + "\n";

        }
        return result;


    }

    public Integer getNumberOfExamsTaken() {

        return examScores.size();
    }

    public void addExamScore(Double score) {

        examScores.add(score);
    }

    public void setExamScores(int examNumber, Double newScore) {

        examScores.set(examNumber - 1, newScore);

    }

    public Double getAverageExamScore() {

        Double sumOfScores = 0.0;
        for (int i = 0; i < examScores.size(); i++) {
            sumOfScores += examScores.get(i);
        }

        return sumOfScores / examScores.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }


}
