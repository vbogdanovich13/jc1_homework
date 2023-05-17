package part10.task47;


import java.io.File;

public class Task47 {

    public static void main(String[] args) {
        String pack = "src/part10/task47";
        File directory = new File(pack);

        if (directory.isDirectory()) {
            String[] content = directory.list();

            if (content != null) {
                for (String eachFile : content) {
                    File file = new File(pack + "/" + eachFile);
                    if(file.isDirectory()) {
                        System.out.println(eachFile + " является каталогом.");
                    }
                }
                for (String eachFile : content) {
                    File file = new File(pack + "/" + eachFile);
                    if(!file.isDirectory()) {
                        System.out.println(eachFile + " является файлом.");
                    }
                }
            }
        }
    }
}
