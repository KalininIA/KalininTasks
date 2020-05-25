
import java.util.Scanner;

import static java.lang.System.*;

public class Task6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите начение Х: ");
        int x = in.nextInt();
        System.out.print("Введите начение Y: ");
        int y = in.nextInt();
        System.out.print("Введите начение Z: ");
        int z = in.nextInt();
        int sredar = ((x + y + z) / 3);
        int delennoe = (sredar / 2);

        System.out.println("Среднее арифметическое чисел x,y,z: " + sredar);
        if( delennoe > 3 ) {
            System.out.println("Программа выполнена корректно");
        }

    }
}