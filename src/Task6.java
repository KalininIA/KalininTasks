
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите начение X: ");
        double x = in.nextDouble();
        System.out.print("Введите начение Y: ");
        double y = in.nextDouble();
        System.out.print("Введите начение Z: ");
        double z = in.nextDouble();
        double sredar = (x + y + z) / 3;
        double delennoe = sredar / 2;

        System.out.println("Среднее арифметическое чисел x,y,z: " + sredar);
        if(delennoe > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}