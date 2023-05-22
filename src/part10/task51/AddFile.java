package part10.task51;

import java.io.*;

public class AddFile {
    void writeFiles() {
        try {
            DataOutputStream dataOut;
            int count = 0;
            int number;

            for (int i = 1; i <= 5; i++) {
                dataOut = new DataOutputStream(new BufferedOutputStream
                        (new FileOutputStream("src//part10//task51//folder1/folder2/folder3/file" + i)));
                while (count < 10) {
                    number = (int) (Math.random() * 10000 + 1);
                    dataOut.writeInt(number);
                    System.out.print(number + " ");
                    count++;
                }
                dataOut.close();
                count = 0;
                System.out.println();
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readAndWrite() {
        try (DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream
                (new FileOutputStream("src//part10//task51//folder1/folder2/folder3/allFile")))
        ) {
            DataInputStream dataIn;

            for (int i = 1; i <= 5; i++) {
                dataIn = new DataInputStream(new BufferedInputStream
                        (new FileInputStream("src//part10//task51//folder1/folder2/folder3/file" + i)));
                for (int j = 0; j < 10; j++) {
                    int num = dataIn.readInt();
                    dataOut.writeInt(num);
                }
                dataIn.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void addFileDirectory() {
        try (FileWriter fileWriter = new FileWriter("src//part10//task51//folder1/folder2/folder3/directory")
        ) {
            File file = new File("src//part10//task51//folder1/folder2/folder3");

            String[] files = file.list();

            for (String f: files){
                fileWriter.write(f + " ");
            }

        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
