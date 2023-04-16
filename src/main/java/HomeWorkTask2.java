/*
Задать одномерный массив и найти в нем минимальный и максимальный элементы.
 */
import java.util.Arrays;
public class HomeWorkTask2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 11);

        }
        System.out. println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length - 1; i ++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length - 1; i ++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.printf("Максимальное значение в массиве %s%n", max);
        System.out.printf("Минимальное значение в массиве %s%n", min);
    }
}
