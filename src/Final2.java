import java.util.Arrays;
import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        System.out.print("Сколько числел нужно записать в массив?:");
        Scanner in = new Scanner(System.in);
        int dlina = in.nextInt();
        int nums[] = new int[dlina];
        if (dlina <= 0) {
            System.out.print("Нельзя создарть массив с нулевой размерностью. Запустите программу заново.");
            System.exit(0);}
        else {
            System.out.print ("Введите " + (dlina) + " чисел для добавления в массив: ");
            for (int i = 0; i < dlina; i++) {
                nums[i] = in.nextInt();
            }
        }
        insertIntoSort(nums);
    }
    public static void insertIntoSort(int[] arrayToSort) {
        int dlina2;
        int j = 0;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                dlina2 = arrayToSort[i + 1];
                arrayToSort[i + 1] = arrayToSort[i];
                j = i;
                while (j > 0 && dlina2 < arrayToSort[j - 1]) {
                    arrayToSort[j] = arrayToSort[j - 1];
                    j--;
                }
                arrayToSort[j] = dlina2;
            }
        }
        System.out.print("Отсортированный по возрастанию массив: ");
        System.out.println(Arrays.toString(arrayToSort));
    }
}
