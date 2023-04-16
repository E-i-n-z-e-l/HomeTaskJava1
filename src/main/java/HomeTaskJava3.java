import java.util.Arrays;

/*
Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
то есть [0][0], [1][1], [2][2], …, [n][n];
 */
public class HomeTaskJava3 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        System.out. println(Arrays.toString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
