import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.print("Сколько числел нужно записать в массив?:");
        Scanner in = new Scanner(System.in);
        int dlina = in.nextInt();
        int nums[] = new int[dlina];
        if (dlina == 0) {
            System.out.print("Нельзя создарть массив с нулевой размерностью. Запустите программу заново.");
            System.exit(0);}
        if (dlina >0) {
            System.out.print ("Введите " + (dlina) + " целых чисел для добавления в массив через пробел: ");
            for (int i = 0; i < dlina; i++) {
                nums[i] = in.nextInt();
            }
            System.out.print ("Данные массива умноженные на 2: ");
            for (int i = 0; i < dlina; i++) {
                System.out.print (" " + nums[i]*2);
            }
            System.out.println();
        }

    }
}