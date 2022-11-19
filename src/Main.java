import utils.LearningClass;
import utils.ScientificTitle;
import utils.Student;
import utils.Teacher;

/*
* Two students are the same, when they grades' sum is the same number.
* */
public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Adam", "Malysz", ScientificTitle.PHD);
        System.out.println(teacher);

        Student student = new Student("Kinga", "Spt");
        student.addGrade(5);
        student.addGrade(3);

        System.out.println(student);
        Student piotr = new Student("Piotr", "Jas");
        piotr.addGrade(4);
        System.out.println("Are Piotr and Kinga the same? - " + piotr.equals(student));

        Student karolina = new Student("Karolina", "Knp");
        karolina.addGrade(4);
        karolina.addGrade(4);
        System.out.println("Are Karolina and Kinga the same? - " + karolina.equals(student));

        LearningClass learningClass = new LearningClass(teacher);
        learningClass.addStudent(student);
        learningClass.addStudent(piotr);
        learningClass.addStudent(karolina);

        System.out.println(learningClass.getStudentsNumbers());
        System.out.println(learningClass.getExactStudentFromIndex(0));
        System.out.println(learningClass.getCopyOfStudentFromIndex(0));

        /*
        * NOTICE THAT STUDENTS ARE SORTED IN THE DECREASED SUM OF GRADES ORDER
        * LOOK AT COMPARATOR INTERFACE - HOW TO SORT LISTS ;)
        * */
        System.out.println(learningClass);


    }
}