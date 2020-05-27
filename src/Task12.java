import java.util.Scanner;

public class Task12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String x = in.nextLine();
        char[] chArray = x.toCharArray();
        for(int y = 0; y < chArray.length; y++){
            if(chArray[y] == ' ') {
                chArray[y] = 0;
            }
        }
        System.out.println(chArray);
    }
}
