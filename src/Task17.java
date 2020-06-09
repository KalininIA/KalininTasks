import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String str;
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("C:/test/test2.txt")) {
            System.out.println("Вводите текст в командную строку. Для перехода на новую строку используйте Enter. Для прекращения записи текста в файл введите 'stop' на новой строке. ");
            do {
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            }
            while(str.compareTo("stop") != 0);
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
