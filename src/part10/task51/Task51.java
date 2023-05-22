package part10.task51;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task51 {
    public static void main(String[] args) {
        String path = "src//part10//task51//folder1/folder2/folder3";
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        AddFile addFile = new AddFile();
        addFile.writeFiles();
        addFile.readAndWrite();
        addFile.addFileDirectory();
    }
}
