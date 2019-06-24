package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void constructorTest() {
        //given
        String firstName = "Will";
        String lastName = "Smith";
        Double[] examScores = {100.0};

        //when
        Student student = new Student(firstName, lastName, examScores);

        String expected = "Will";
        String actual = student.getFirstName();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFirstNameTest() {
        //given
        Double[] examScores = {100.0};
        Student student = new Student("Bill", "Smith", examScores);


        //when
        String expected = "Bill";
        String actual = student.getFirstName();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setFirstNameTest() {

        //given
        Double[] examScores = {100.0};
        Student student = new Student("Bill", "Smith", examScores);

        //when
        String expected = "Clyde";
        student.setFirstName("Clyde");
        String actual = student.getFirstName();


        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setLastNameTest() {
        //given
        Double[] examScores = {100.0};
        Student student = new Student("Tommy", "Smith", examScores);

        //when
        String expected = "Brown";
        student.setLastName("Brown");
        String actual = student.getLastName();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getLastName() {
        //given
        Double[] examScores = {100.0};
        Student student = new Student("Dan", "Collins", examScores);

        //when
        String expected = "Collins";
        String actual = student.getLastName();

        //then
        Assert.assertEquals(actual, expected);


    }

    @Test
    public void getExamScores() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 200.0, 300.0, 230.0};

        Student student = new Student(firstName, lastName, examScores);


        // When
        String actual = student.getExamScores();
        String expected = "\tExam1->100.0\n" +
                "\tExam2->200.0\n" +
                "\tExam3->300.0\n" +
                "\tExam4->230.0\n";

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addExamScoreTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 200.0, 300.0, 230.0};

        Student student = new Student(firstName, lastName, examScores);

        student.addExamScore(100.0);
        Integer expected = 5;
        Integer actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void setExamScoreTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 300.0, 130.0, 230.0};

        Student student = new Student(firstName, lastName, examScores);

        student.setExamScores(3, 120.0);


        String expected = "\tExam1->100.0\n" +
                "\tExam2->300.0\n" +
                "\tExam3->120.0\n" +
                "\tExam4->230.0\n";


        String actual = student.getExamScores();


        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getAverageExamScore(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 110.0, 90.0, 100.0};

        Student student = new Student(firstName, lastName, examScores);

        Double expected = 100.0;
        Double actual = student.getAverageExamScore();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toStringTest(){
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 110.0, 90.0, 100.0};

        Student student = new Student(firstName, lastName, examScores);

        String expected = "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" +"[100.0, 110.0, 90.0, 100.0]"+
                '}';
        String actual = student.toString();

        Assert.assertEquals(expected, actual);

    }


}
