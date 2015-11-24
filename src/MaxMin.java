public class MaxMin {
    int mass[][] = new int[6][7];


    public void randomMas() {
        for (int x = 0; x < mass.length; x++) {
            for (int y = 0; y < mass[x].length; y++) {
                mass[x][y] = (int) (Math.random() * 10);
            }
        }
    }

    public void sortChenge() {
        for (int x = 0; x < mass.length; x++) {
            int max = 0;
            int min = 10;
            int maxIndex = 0;
            int minIndex = 0;
            for (int i = mass[x].length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (min >= mass[x][j]) {
                        min = mass[x][j];
                        minIndex = j;
                    }
                    if (max <= mass[x][j]) {
                        max = mass[x][j];
                        maxIndex = j;
                    }
                }
            }
            mass[x][maxIndex] = mass[x][mass[x].length - 1];
            mass[x][mass[x].length - 1] = max;

            mass[x][minIndex] = mass[x][0];
            mass[x][0] = min;

        }

    }

    public void printMas() {
        for (int x = 0; x < mass.length; x++) {
            for (int y = 0; y < mass[x].length; y++) {
                System.out.print(mass[x][y] + "| ");
            }
            System.out.println();
        }
    }

}
