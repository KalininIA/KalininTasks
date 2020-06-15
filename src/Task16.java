import java.io.*;

public class Task16 {
    public static void main(String args[]) {
        String s = null;
        try (BufferedReader br =
                     new BufferedReader(new FileReader("src/test3.txt"))) {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}