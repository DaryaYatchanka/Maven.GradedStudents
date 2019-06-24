package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void getAverageExamScore() {
        Double[] s1Scores = {100.0, 150.0};
        Double[] s2Scores = {225.0, 25.0};

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);

        Double expected = 125.0;
        Double actual = classroom.getAverageExamScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudent(){
        //Given
        Classroom classroom = new Classroom(1);
        Double[] s1Scores = {100.0, 150.0};
        Student student = new Student("Wilhem", "27",s1Scores);

       //When
        classroom.addStudent(student);
        Student[] isThere =   classroom.getStudents();
        Student actual  =isThere[0];


        //Then
        Assert.assertNotNull(actual);
    }

    @Test
    public void removeStudent(){
        Classroom classroom =new Classroom(3);
        Double[] s1Scores={100.0, 150.0};
        Student student1 = new Student("Eugene", "Papko", s1Scores);

        Double[] s2Scores={110.0, 160.0};
        Student student2 = new Student("Oliver", "Papko", s2Scores);

        Double[] s3Scores={130.0, 150.0};
        Student student3 = new Student("Andrew", "Papko", s3Scores);


        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        classroom.removeStudent("Oliver", "Papko");

        Student[] expected ={student1, student3, null};
        Student[] actual =classroom.getStudents();

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void getStudentByScore(){
        Classroom classrom = new Classroom(6);
        Double[] s1Scores={100.0,100.0};
        Student student1 = new Student("Eugene", "Papko", s1Scores);

        Double[] s2Scores={50.0, 60.0, 40.0};
        Student student2 = new Student("Oliver", "Smith", s2Scores);

        Double[] s3Scores={70.0, 80.0, 60.0};
        Student student3 = new Student("Andrew", "Collin", s3Scores);

        Double[] s4Scores={80.0, 70.0, 90.0};
        Student student4 = new Student("Ed", "Brown", s4Scores);

        Double[] s5Scores={100.0,100.0};
        Student student5 = new Student("Henry", "Z", s5Scores);

        Double[] s6Scores={100.0,100.0};
        Student student6 = new Student("Dan", "Papko", s6Scores);





        classrom.addStudent(student1 );
        classrom.addStudent(student2 );
        classrom.addStudent(student3 );
        classrom.addStudent(student4 );
        classrom.addStudent(student5 );
        classrom.addStudent(student6 );




        Student[] expected ={student6, student1, student5, student4,student3, student2 };
        Student[] actual = classrom.getStudentByScore(classrom.getStudents());

        Assert.assertEquals(expected, actual);

    }
}
