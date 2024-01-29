package Homework5;
// Функция для создания резервной копии файлов в директории
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupFiles {

    public static void createBackup(String sourceDirectory) {
        File directory = new File(sourceDirectory);
        File backupDirectory = new File(directory, "backup");

        if (!backupDirectory.exists()) {
            boolean success = backupDirectory.mkdir();

            if (!success) {
                System.out.println("Failed to create backup directory.");
                return;
            }
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        Path sourcePath = file.toPath();
                        Path destinationPath = new File(backupDirectory, file.getName()).toPath();
                        Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("Backup created successfully in " + backupDirectory.getAbsolutePath());
    }

    public static void main(String[] args) {
        createBackup("D:\\Java\\Homeworks V\\src\\Homework5");
    }
}



