import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String num = in.nextLine();
        int number = Integer.parseInt(num, 0b10);

        System.out.printf("Число в десятичном формате: %d \n", number);

    }
}