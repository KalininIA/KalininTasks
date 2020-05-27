import java.util.Scanner;

public class Task13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String x = in.nextLine();
        int length1 = x.length();
        System.out.print("Введите строку 2: ");
        String y = in.nextLine();
        int length2 = y.length();
        if (length1 > length2)
            System.out.println(x);
        else if (length1 < length2)
            System.out.println(y);
        else
            System.out.println("Длина строк одинаковая");
    }
}
