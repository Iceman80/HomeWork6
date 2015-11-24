public class Main {
    public static void main(String[] args) {

        System.out.println(" 1).");
        Simple task1 = new Simple();
        task1.task1();
        System.out.println();

        System.out.println("  2).");
        AdditionMassive adMass = new AdditionMassive();
        adMass.copyArray();
        System.out.println();
        System.out.println("\n  3).");
        System.out.println(" Созданый двумерный массив");
        MaxMin maxMin = new MaxMin();
        maxMin.randomMas();
        maxMin.printMas();
        maxMin.sortChenge();
        System.out.println();
        System.out.println(" Отсортированы первый и последний элемент строки массива");
        maxMin.printMas();

        System.out.println("\n  4).");
        Nok nok = new Nok();
        nok.nok(3, 6, 8);

        System.out.println("\n  5).");
        Student student1 = new Student("Яковлев Сергей", 5, 5, 4, 4, 0);
        student1.addStudent(student1);
        Student student2 = new Student("Иванов Петр Иванович", 3, 5, 3, 4, 0);
        student2.addStudent(student2);
        Student student3 = new Student("Афанасьев Иван", 2, 5, 0, 5, 3);
        student3.addStudent(student3);
        student1.reporStud();
        student1.reporStudRating();
    }
}
