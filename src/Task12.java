import java.util.Scanner;

public class Task12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = in.nextLine();
        x = x.replaceAll(" ", "");
        System.out.println(x);
    }
}