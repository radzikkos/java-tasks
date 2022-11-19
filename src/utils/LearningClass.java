package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LearningClass {

    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public LearningClass(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public int getStudentsNumbers() {
        return this.students.size();
    }

    public Student getExactStudentFromIndex(int index) {
        return this.students.get(index);
    }

    public Student getCopyOfStudentFromIndex(int index) {
        return new Student(this.students.get(index));
    }

    @Override
    public String toString() {
        this.sortStudentsInPlace();
        return "CLASS:\n" + this.teacher.toString() + "\n"+ this.students
                .stream().map(n -> String.valueOf(n))
                .collect(Collectors.joining(",\n"));
    }

    private void sortStudentsInPlace() {
        Collections.sort(this.students, new StudentsSorter());
    }


}
