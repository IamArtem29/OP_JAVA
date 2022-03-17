import java.util.Random;

/*  Дан двумерный массив A, размером (nxn) (или квадратная матрица A).
Найти среднее геометрическое положительных элементов её  побочной диагонали */

public class SecondWork2_4 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int max = 19;
        int values = 1;
        int positives = 0;
        int len = matrix.length;
        Random random = new Random();
        System.out.println("Матрица:");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int element = -9 + random.nextInt(max);
                matrix[i][j] = element;
                System.out.print(matrix[i][j] + " ");
                if (j == len - i - 1 && element > 0) {
                    positives++;
                    values *= element;
                }
            }
            System.out.println("");
        }
        System.out.println("среднее геометрическое = " + Math.pow(values, 1.0 / positives));
    }
}