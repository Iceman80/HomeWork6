public class Nok {

    public void nok(int a, int b, int c) {
        System.out.println("");
        System.out.println("Наименьшее общее кратное трех натуральных чисел " + a + ", " + b + ", " + c + ", равно " + (a * b * c) / Euclid(Euclid(a, b), c));
    }

    public int Euclid(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return Euclid(b, a % b);
        }
    }


}