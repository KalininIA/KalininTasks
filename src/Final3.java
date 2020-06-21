import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара к рублю для конвертации: ");
        double rate = in.nextDouble();
        System.out.print("Введите сумму в рублях для конвертации: ");
        double sum = in.nextDouble();
        double result = sum/rate;
        System.out.print("Итого: ");
        System.out.print(String.format("%.2f", result));
        System.out.print(" долларов");


    }
}
