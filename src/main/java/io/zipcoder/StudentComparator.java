package io.zipcoder;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int comparison = Double.compare(o2.getAverageExamScore(), o1.getAverageExamScore());
        if (comparison == 0){
            comparison = o1.getLastName().compareTo(o2.getLastName());
            if (comparison == 0){
                comparison = o1.getFirstName().compareTo(o2.getFirstName());
            }
        }
        return comparison;

    }


}
