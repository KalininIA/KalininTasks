import java.io.*;

class Task18 {
    public static void main(String args[]) {
        int line = 0;
        String n = null;
        try (BufferedReader br =
                     new BufferedReader(new FileReader("src/test3.txt"))) {
            while((n = br.readLine()) != null) {
                int i = line;
                line = (i + 1);
            }
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
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
        int stroka = 0;
        String str = null;
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        try (FileWriter fw = new FileWriter("src/test3.txt")) {
            System.out.println("Вы можете ввести не более " + line +  " строк т.к. исходный файл содержит " + line + " строк.");
            System.out.println("Вводите текст в командную строку. Для перехода на новую строку используйте Enter.");
            System.out.println("Для досрочного прекращения записи текста в файл введите stop на новой строке, но это приведет к уменьшению количества строк файла записи.");
            do {
                if(line == 0) break;
                System.out.print(": ");
                str = br.readLine();
                if(str.equals("stop")) break;
                str = str + "\r\n";
                fw.write(str);
                int x = stroka;
                stroka = (x + 1);
                if(stroka == line) break;
            }
            while(!"stop".equals(str));
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
