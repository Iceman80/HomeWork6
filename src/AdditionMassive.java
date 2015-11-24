public class AdditionMassive {
    int mas1[] = {1, 2, 3, 4, 5, 11, 12, 13, 14, 15};
    int mas2[] = {6, 7, 8, 9, 10};
    int k = 5;
    int addMas[] = new int[mas1.length + mas2.length];

    public void copyArray() {
        System.arraycopy(mas1, 0, addMas, 0, k);
        System.arraycopy(mas2, 0, addMas, k, mas2.length);
        System.arraycopy(mas1, k, addMas, k + mas2.length, mas1.length - k);
        System.out.println("Число к = " + k);
        System.out.println("Исходный массив №1 ");
        printArray(mas1);
        System.out.println("\nИсходный массив №2 ");
        printArray(mas2);
        System.out.println("\nОбъединенный массив ");
        printArray(addMas);
    }

    public void printArray(int mass[]) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
