import java.util.Random;

/*  Дан массив x (n) . Переписать в массив y(n) отрицательные элементы
массива x деленные на 2. (со сжатием., без пустых элементов внутри). Затем
упорядочить методом по возрастанию новый массив.  */

public class SecondWork2_2 {
    public static void main(String[] args) {
        int[] arX = new int[10];
        float[] arY = new float[arX.length];
        int counter = 0;
        int max = 19;
        Random random = new Random();
        System.out.print("Массив X: ");
        for (int i = 0; i < arX.length; i++) {
            int element = -9 + random.nextInt(max);
            arX[i] = element;
            System.out.print(arX[i] + " ");
            if (arX[i] < 0) {
                arY[counter] = arX[i];
                counter++;
            }
        }
        System.out.println("");
        System.out.print("Массив Y: ");
        float[] result = new float[counter];
        for (int i = 0; i < result.length; i++) {
            result[i] = arY[i] / 2;
            System.out.print(result[i] + " ");
        }
        System.out.println("");
        System.out.print("Отсортированный массив Y: ");
        sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static void sort(float[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int mPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[mPos]) {
                    mPos = j;
                }
            }
            float temp = array[mPos];
            array[mPos] = array[i];
            array[i] = temp;
        }
    }
}