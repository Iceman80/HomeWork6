import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    static Set<Student> studyV = new TreeSet<>();
    String userName;
    Integer rating1;
    Integer rating2;
    Integer rating3;
    Integer rating4;
    Integer extraPoint;

    public Student(String userName, Integer rating1, Integer rating2, Integer rating3, Integer rating4, Integer extraPoint) {
        this.userName = userName;
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
        this.rating4 = rating4;
        this.extraPoint = extraPoint;
    }

    @Override
    public String toString() {
        return "ФИО студента -\t" + userName +
                ", оценка за 1 экзамен  -\t" + rating1 +
                ", оценка за 2 экзамен  - " + rating2 +
                ", оценка за 3 экзамен  - " + rating3 +
                ", оценка за 4 экзамен  - " + rating4 +
                ", дополнительные баллы  - " + extraPoint;
    }

    public void addStudent(Student student) {
        for (Student temp : studyV) {
            if (temp.userName.equals(student.userName)) {
                System.out.println("Студент с таким Именем и Фамилией " + temp.userName + " уже в базе ");
                System.out.println();
            }
        }
        studyV.add(student);
    }

    public void reporStud() {
        for (Student temp : studyV) {
            System.out.println(temp);
        }
    }

    public void reporStudRating() {
        System.out.println();
        for (Student temp : studyV) {
            System.out.println("ФИО - " + temp.userName + " сумма балов студента - " + (temp.rating1 + temp.rating2 + temp.rating3 + temp.rating4 + temp.extraPoint));
        }
    }

    @Override
    public int compareTo(Student t) {
        return (this.userName.compareTo(t.userName));

    }
}
