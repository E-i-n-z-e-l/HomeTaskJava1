import java.util.Arrays;
import java.util.Scanner;
/*
Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
типа int длиной len, каждая ячейка которого равна initialValue;
 */
public class HomeTaskJava1 {
    public static void main(String[] args) {
        CreateArray();
    }

    private static void CreateArray() {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int len = newScanner.nextInt();
        //Scanner newnewScanner = new Scanner(System.in);
        System.out.println("Введите значение которым заполнить массив: ");
        int initialValue = newScanner.nextInt();
        int[] newArray = new int[len];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = initialValue;
        }

        System.out. println(Arrays.toString(newArray));
    }
}
