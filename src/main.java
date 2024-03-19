import java.io.File;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int N = 0;
        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (fileExists && !isDirectory) {
                System.out.println("Путь указан верно");
                N += 1;
                System.out.println("Это файл номер " + N);
            } else if (!fileExists) {
                System.out.println("указанный файл не существует");
                continue;
            } else if (isDirectory) {
                System.out.println("указанный путь является путем к папке");
                continue;
            }
        }
    }
}


