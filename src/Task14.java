import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String s = in.nextLine();
        int x = (int)Math.round(Double.parseDouble(s));
        double y = (double)x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}