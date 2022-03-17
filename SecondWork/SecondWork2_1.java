import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*  Переписать элементы массива в обратном порядке на том же
месте. Вывести результативный массив на экран */

public class SecondWork2_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int max = 10;
        int len = array.length;
        System.out.print("Массив: ");
        for (int i = 0; i < len; i++) {
            int element = random.nextInt(max);
            array[i] = element;
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.print("Обратный массив: ");
        for (int m = 0; m < len / 2; m++) {
            int temp = array[m];
            array[m] = array[len - m - 1];
            array[len - m - 1] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}