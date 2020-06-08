import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
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
        bubbleSort(nums);
    }
    public static void bubbleSort(int[] arrayToSort){
        int dlina2;
        do {
            dlina2 = 0;
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1] ) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                    dlina2++;
                }
            }
        } while (dlina2 > 0);
        System.out.print("Отсортированный по возрастанию массив: ");
        System.out.println(Arrays.toString(arrayToSort));
    }
}
