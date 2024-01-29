package Homework5;
// Функция для добавления префикса к набору файлов
import java.io.File;

import static Homework5.BackupFiles.createBackup;

public class AddPrefix {

    public static void addPrefixToFiles(String prefix, String... filenames) {
        for (String filename : filenames) {
            File file = new File(filename);

            if (file.exists()) {
                String newName = prefix + file.getName();
                File newFile = new File(file.getParent(), newName);
                file.renameTo(newFile);
                System.out.println("File " + filename + " renamed to " + newName);
            } else {
                System.out.println("File " + filename + " does not exist.");
            }
        }
    }

    public static void main(String[] args) {
        addPrefixToFiles("prefix_", "D:\\Java\\Homeworks V\\src\\Homework5\\file1.txt", "D:\\Java\\Homeworks V\\src\\Homework5\\file2.txt");
    }
}


