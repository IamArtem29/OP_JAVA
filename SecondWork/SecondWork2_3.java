import java.util.Random;
import java.util.Scanner;

/*  Определить матрицу (двумерный массив) и ее заполнить случайными значениями.
    Постровить вектор, который возвращает число элементов i-й строки,
    значения которых меньше заданного значения*/

public class SecondWork2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int max = 19;
        int len = 5;
        int countM = 0;
        int[] vectorB = new int[5];
        Random random = new Random();
        System.out.print("Введите значение:");
        int value = scanner.nextInt();
        System.out.println("Матрица:");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int element = -9 + random.nextInt(max);
                matrix[i][j] = element;
                if (element < value) {
                    countM += 1;
                }
            }
            vectorB[i] = countM;
            countM = 0;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("Количество элементов меньше заданного значения в строке " + i + " - " + vectorB[i]);
        }
    }
}