package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student  extends Person {

    private List<Integer> grades = new ArrayList<>();

    public Student(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Student(Student student) {
        super(student.getFirstname(), student.getLastname());

    }


    public void addGrade(Integer grade) {
        this.grades.add(grade);
    }

    @Override
    public String toString() {
        return super.toString() + " My grades are: " + this.grades.stream().map(n -> String.valueOf(n))
                .collect(Collectors.joining(", "));
    }

    public int getStudentGradesSum() {
        return this.grades.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        int studentGradesSum = student.grades.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        int currentStudentGradesSum = this.getStudentGradesSum();
        return studentGradesSum == currentStudentGradesSum;
    }
}
