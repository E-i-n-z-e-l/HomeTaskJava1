/*
Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
Для усложнения задачи нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
[ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
При каком n в какую сторону сдвиг можете выбирать сами.
 */

import java.util.Arrays;

public class HomeTaskJava5 {
    public static void main(String[] args) {
//        Решение БЕЗ создания МЕТОДА!!!
//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
//        System.out.println(Arrays.toString(array));
//        int digit = 4;
//        int temp = array[0];
//        while (digit > 0) {
//            for (int i = 0; i < array.length - 1; i ++) {
//                for (int j = 0; j < array.length - 1; j++) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//            digit = digit - 1;
//        }
//        System.out.println(Arrays.toString(array));
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayCry(arr, -4);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] ArrayCry(int[] a, int b) {
        int temp = a[0];
        if (b > 0) {
            while (b > 0) {
                for (int i = 0; i < a.length - 1; i++) {
                    for (int j = 0; j < a.length - 1; j++) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
                b = b - 1;
            }

        }
        if (b == 0) {
            return a;
        }
        if (b < 0) {
            while (b < 0) {
                for (int i = a.length - 1; i > 0; i--) {
                    for (int j = a.length - 1; j > 0; j--) {
                        temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
                b = b + 1;
            }
        }
        return a;
    }
}
