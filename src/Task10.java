import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); {
            System.out.print("Сколько строк будет содержать массив?:");
        }
        int n = new Scanner(System.in).nextInt(); {
            System.out.print("Сколько столбцов будет содержать массив?:");
        }
        int m = new Scanner(System.in).nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Введите значение для строки " + i + " и столбца: " + j + " : ");
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            while (i != 0);
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]*3 + "\t");
            }
            System.out.println();
        }
    }
}