package io.zipcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Classroom {
    private Student[] students;

    public Classroom(){

        this.students= new Student[30];
    }

    public Classroom(int maxNumberOfStudents){

        this.students= new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){

        this.students=students;
    }


    public Student[] getStudents(){
        return students;
    }

    public Double getAverageExamScore(){
      Double count = 0.0;
        for (int i = 0; i < students.length; i++) {
           count += students[i].getAverageExamScore();

        }

        return count/students.length;

    }

    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                students[i] = student;
                break;
            }
        }

    }

    public void removeStudent(String firstName, String lastName){
       Student[] myStudents = new Student[students.length];
       int index =0;
        for (int i = 0; i <students.length ; i++) {
           if( !(students[i].getFirstName()==firstName && students[i].getLastName()==lastName) && students[i]!=null){
              myStudents[index]=students[i];
              index++;
           }

        }
       this.students=myStudents;
    }

    public Student[] getStudentByScore(Student[] st) {
        Arrays.sort(st, new StudentComparator());

        return st;
    }





}

