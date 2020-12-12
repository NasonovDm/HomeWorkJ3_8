package HomeWork_Java3_8;

public class Main {
    
    public static void main(String[] args) {

        int m = 5;
        int n = 7;
        int s = 1;

        int[][] array = new int[m][n];

        for (int y = 0; y < n; y++) {
            array[0][y] = s;
            s++;
        }
        for (int x = 1; x < m; x++) {
            array[x][n - 1] = s;
            s++;
        }
        for (int y = n - 2; y >= 0; y--) {
            array[m - 1][y] = s;
            s++;
        }
        for (int x = m - 2; x > 0; x--) {
            array[x][0] = s;
            s++;
        }

        int c = 1;
        int d = 1;

        while (s < m * n) {
           //Движение в право.
            while (array[c][d + 1] == 0) {
                array[c][d] = s;
                s++;
                d++;
            }

            //Движение вниз.
            while (array[c + 1][d] == 0) {
                array[c][d] = s;
                s++;
                c++;
            }

            //Движение влево.
            while (array[c][d - 1] == 0) {
                array[c][d] = s;
                s++;
                d--;
            }

            //Движение вверх.
            while (array[c - 1][d] == 0) {
                array[c][d] = s;
                s++;
                c--;
            }
        }

        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = s;
                }
            }
        }

        //Вывод массива в консоль.
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] < 10) {

                    System.out.print(array[x][y] + ",  ");
                } else {
                    System.out.print(array[x][y] + ", ");
                }
            }
            System.out.println("");
        }
    }
}
