import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String binnum = in.nextLine();
        int num = 0;
        for (int i = binnum.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            num += (binnum.charAt(i) - '0') * j;
        }
        System.out.println("Число в десятичном формате: " + num);
    }
}
