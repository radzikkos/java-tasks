package utils;

import java.util.Comparator;

public class StudentsSorter implements Comparator<Student> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return b.getStudentGradesSum() - a.getStudentGradesSum();
    }

}
