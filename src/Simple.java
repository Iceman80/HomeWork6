public class Simple {
    int mass[] = new int[50];

    public void intMassive() {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
    }

    public void printMass() {
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public void controlPrime() {
        for (int i = 0; i < mass.length; i++) {
            if (isPrime(mass[i])) {
                System.out.println("Номер элемента содержащего простое число - " + i + "  простое число- " + mass[i] + "  ");
            }

        }
    }

    public void task1() {
        intMassive();
//        printMass();
        controlPrime();

    }
}
