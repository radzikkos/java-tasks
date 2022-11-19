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

        List<Person> people = Arrays.asList(teacher, student, karolina, piotr);

        System.out.println();
        System.out.println("PEOPLE CREATED IN THE APP");
        for(Person person: people) {
            System.out.println(person);
        }


        LearningClass learningClass = new LearningClass(teacher);
        learningClass.addStudent(student);
        learningClass.addStudent(piotr);
        learningClass.addStudent(karolina);

        System.out.println();
        System.out.println("NUMBERS OF STUDENTS " + learningClass.getStudentsNumbers());
        System.out.println(learningClass.getExactStudentFromIndex(0));
        System.out.println(learningClass.getCopyOfStudentFromIndex(0));

        System.out.println();
        /*
         * NOTICE THAT STUDENTS ARE SORTED IN THE DECREASED SUM OF GRADES ORDER
         * LOOK AT COMPARATOR INTERFACE - HOW TO SORT LISTS ;)
         * */
        System.out.println(learningClass);


    }
}

/*
* I am Adam Malysz. My title is PHD.
I am Kinga Spt. My grades are: 5, 3
Are Piotr and Kinga the same? - false
Are Karolina and Kinga the same? - true

PEOPLE CREATED IN THE APP
I am Adam Malysz. My title is PHD.
I am Kinga Spt. My grades are: 5, 3
I am Karolina Knp. My grades are: 4, 4
I am Piotr Jas. My grades are: 4

NUMBERS OF STUDENTS 3
I am Kinga Spt. My grades are: 5, 3
I am Kinga Spt. My grades are:

CLASS:
I am Adam Malysz. My title is PHD.
I am Kinga Spt. My grades are: 5, 3,
I am Karolina Knp. My grades are: 4, 4,
I am Piotr Jas. My grades are: 4

Process finished with exit code 0

* */